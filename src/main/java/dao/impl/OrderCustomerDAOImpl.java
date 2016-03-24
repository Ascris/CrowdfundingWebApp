package dao.impl;

import javax.transaction.Transactional;

import model.OrderCustomer;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import dao.OrderCustomerDAO;

@Repository
@Transactional
public class OrderCustomerDAOImpl extends GenericDAOImpl<OrderCustomer, Long> implements
		OrderCustomerDAO {

	public void delete(final Long orderCustomerId){
		//TODO problème javassist ??
		removeById(orderCustomerId);
	}
	
	 @Autowired
     @Override
     public void setSessionFactory(SessionFactory sessionFactory) {
             super.setSessionFactory(sessionFactory);
     }
}
