package dao;

import model.OrderCustomer;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface OrderCustomerDAO extends GenericDAO<OrderCustomer, Long> {

	public void delete(final Long orderCustomerId);

}
