package action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.CustomerService;
import service.OrderCustomerService;

import com.opensymphony.xwork2.ActionSupport;

import dto.CustomerDTO;
import dto.OrderCustomerDTO;

/**
 * Cette classe fournit les différentes actions disponibles pour la page
 * customer.jsp
 * 
 * Dans le contexte Spring, les controllers sont des beans décrits par
 * l'annotation @Controller et situé dans la couche présentation.
 * 
 * !!ATTENTION!! Les méthodes des classes Action ne peuvent appeler que des
 * méthodes de la couche Service ! Il est formellement interdit d'appeler une
 * méthode d'un DAO dans la couche présentation !!
 *
 */
@Controller
public class ListCustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6874495899552728610L;

	private static final String SUCCESS = "success";

	private List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
	private CustomerDTO customer;
	private OrderCustomerDTO orderCustomer;
	private Long orderCustomerId;
	private Long customerId;

	/*
	 * Cette annotation permet à Spring d'injecter une dépendance à cette
	 * classe. Spring se chargera alors d'initialiser CustomerService, puis
	 * d'utiliser setCustomerService() afin de l'injecter dans cette classe.
	 * Ceci n'est néanmoins possible que si la classe CustomerService est
	 * effectivement détecté comme étant un bean par Spring, ce qui est possible
	 * en utilisant l'annotation @Service
	 */
	@Autowired
	private CustomerService customerService;

	@Autowired
	private OrderCustomerService orderCustomerService;

	/**
	 * Cette methode est une action (définie dans le fichier struts.xml) qui
	 * permet d'initialiser la liste des clients
	 * 
	 * @return
	 */
	public String listCustomer() {

		/*
		 * Grâce à cette ligne, on fait appel à un service de la couche Métier
		 */
		customerList = customerService.listCustomer();

		return SUCCESS;
	}

	/**
	 * Cette methode permet de supprimer le client fournit en paramètre par la
	 * requête
	 * 
	 * @return
	 */
	public String deleteCustomer() {
		/*
		 * On récupère dans la requete le paramètre nécessaire au traitement
		 */
		if (customerId != null) {
			customerService.deleteCustomer(customerId);
		}
		return SUCCESS;
	}

	/**
	 * Cette méthode permet de créer des commandes pour l'utilisateur choisi. Il
	 * n'y a pas de formulaire, mais cela nous permet néanmoins de voir comment
	 * les choses se passent
	 * 
	 * @return
	 */
	public String addOrder() {
		/*
		 * On récupère dans la requete le paramètre nécessaire au traitement
		 */
		if (customerId != null) {
			for (final CustomerDTO customer : customerList) {
				if (customer.getCustomerId() == customerId) {
					final OrderCustomerDTO orderCustomer = new OrderCustomerDTO();
					orderCustomer.setOrderDate(new Date());
					customer.getOrderCustomers().add(orderCustomer);
					customerService.saveCustomerWithOrder(customer);
					break;
				}
			}
		}
		return SUCCESS;
	}

	public String deleteOrder() {
		if (orderCustomerId != null) {
			customerService.deleteOrderById(orderCustomerId);
		}
		return SUCCESS;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public List<CustomerDTO> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerDTO> customerList) {
		this.customerList = customerList;
	}

	public OrderCustomerDTO getOrderCustomer() {
		return orderCustomer;
	}

	public void setOrderCustomer(OrderCustomerDTO orderCustomer) {
		this.orderCustomer = orderCustomer;
	}

	public Long getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(Long orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public OrderCustomerService getOrderCustomerService() {
		return orderCustomerService;
	}

	public void setOrderCustomerService(OrderCustomerService orderCustomerService) {
		this.orderCustomerService = orderCustomerService;
	}

	public List<OrderCustomerDTO> getOrderCustomers() {
		if (customer != null) {
			return customer.getOrderCustomers();
		} else {
			return null;
		}
	}
}