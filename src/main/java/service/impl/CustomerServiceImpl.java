package service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import model.Customer;
import model.OrderCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.CustomerService;
import dao.CustomerDAO;
import dao.OrderCustomerDAO;
import dto.CustomerDTO;

/**
 * Avec Spring, les Services sont des beans particulier, qui sont repéré ici
 * grâce à l'annotation @Service. De plus, l'annotation @Transactionnal permet
 * d'indiquer à Spring que cette classe a besoin qu'une transaction soit active
 * pour fonctionner.
 * 
 * @see service.CustomerService
 * 
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	/*
	 * Cette annotation permet à Spring d'injecter une dépendance à cette
	 * classe. Spring se chargera alors d'initialiser CustomerDAO, puis
	 * d'utiliser setCustomerDAO() afin de l'injecter dans cette classe. Ceci
	 * n'est néanmoins possible que si la classe CustomerDAO est effectivement
	 * détecté comme étant un bean par Spring, ce qui est possible en utilisant
	 * l'annotation @Repository
	 */
	@Autowired
	private CustomerDAO customerDAO;

	@Autowired
	private OrderCustomerDAO orderCustomerDAO;

	public List<CustomerDTO> listCustomer() {
		/*
		 * Grâce à un appel au DAO, on récupère les Clients. Ensuite, on les
		 * convertit en CustomerDTO car les objets entités ne doivent pas aller
		 * dans la couche Présentation
		 */
		final List<Customer> list = customerDAO.listCustomer();
		final List<CustomerDTO> listDTO = new ArrayList<CustomerDTO>();
		for (Customer c : list) {
			listDTO.add(c.entity2BeanWithOrder());
		}
		return listDTO;
	}

	public List<CustomerDTO> listCustomerByName(final String name) {
		final List<Customer> list = customerDAO.findByName(name);
		final List<CustomerDTO> listBean = new ArrayList<CustomerDTO>();
		for (Customer c : list) {
			listBean.add(c.entity2Bean());
		}
		return listBean;
	}

	public void deleteCustomer(final Long customerId) {
		final Customer customer = customerDAO.find(customerId);
		if (customer.getOrderCustomers() != null && customer.getOrderCustomers().size() > 0) {
			for (final OrderCustomer orderCustomer : customer.getOrderCustomers()) {
				orderCustomerDAO.remove(orderCustomer);
			}
		}
		customerDAO.removeById(customerId);
	}

	public CustomerDTO getCustomerById(final Long customerId) {
		final Customer customer = customerDAO.find(customerId);
		if (customer != null) {
			return customer.entity2Bean();
		}
		return null;
	}

	public void saveCustomer(final CustomerDTO customer) {
		if (customer != null) {
			final Customer c = customer.DTO2Entity();
			customerDAO.save(c);
		}
	}

	public void saveCustomerWithOrder(final CustomerDTO customer) {
		if (customer != null) {
			final Customer c = customer.DTO2EntityWithOrder();
			for (final OrderCustomer orderCustomer : c.getOrderCustomers()) {
				orderCustomer.setCustomer(c);
			}
			customerDAO.save(c);
		}
	}
	
	public void deleteOrderById(final Long orderCustomerId){
		final Customer customer = customerDAO.findByOrder(orderCustomerId);
		for(final OrderCustomer orderCustomer : customer.getOrderCustomers()){
			if(orderCustomer.getOrderCustomerId() == orderCustomerId){
				customer.getOrderCustomers().remove(orderCustomer);
				break;
			}
		}
		customerDAO.save(customer);
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(final CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public OrderCustomerDAO getOrderCustomerDAO() {
		return orderCustomerDAO;
	}

	public void setOrderCustomerDAO(OrderCustomerDAO orderCustomerDAO) {
		this.orderCustomerDAO = orderCustomerDAO;
	}

}