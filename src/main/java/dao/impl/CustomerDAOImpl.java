package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import model.Customer;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import dao.CustomerDAO;

/**
 * Avec Spring, les DAO sont des beans particulier, qui sont repéré ici grâce à
 * l'annotation @Repository. De plus, l'annotation @Transactionnal permet
 * d'indiquer à Spring que cette classe a besoin qu'une transaction soit active
 * pour fonctionner.
 *
 * @see dao.CustomerDAO
 * 
 */
@Repository
@Transactional
public class CustomerDAOImpl extends GenericDAOImpl<Customer, Long> implements CustomerDAO {

	public List<Customer> listCustomer() {
		return this.findAll();
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findByName(final String name) {
		final Query query = getSession().getNamedQuery("Customer.findByName");
		query.setParameter("name", name);
		return (List<Customer>) query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findByAddress(final String address) {
		/*
		 * Ici, on appelle la requête Customer.findByAddress qui est définie
		 * dans la classe Customer
		 */
		final Query query = getSession().getNamedQuery("Customer.findByAddress");
		query.setParameter("address", address);
		return (List<Customer>) query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findByNameAndAddress(final String name, final String address) {
		final Query query = getSession().getNamedQuery(
				"Customer.findByNameAndAddress");
		query.setParameter("name", name);
		query.setParameter("address", address);
		return (List<Customer>) query.list();
	}

	public Customer findByOrder(final Long orderCustomerId) {
		final Query query = getSession().getNamedQuery(
				"Customer.findByOrderCustomerId");
		query.setParameter("orderCustomerId", orderCustomerId);
		return (Customer) query.uniqueResult();
	}
	
	 @Autowired
     @Override
     public void setSessionFactory(SessionFactory sessionFactory) {
             super.setSessionFactory(sessionFactory);
     }
}