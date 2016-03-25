package service.impl;

import javax.transaction.Transactional;

import model.OrderCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.OrderCustomerService;
import dao.OrderCustomerDAO;

@Service
@Transactional
public class OrderCustomerServiceImpl implements OrderCustomerService {

	@Autowired
	private OrderCustomerDAO orderCustomerDAO;
	
	public OrderCustomerDAO getOrderCustomerDAO() {
		return orderCustomerDAO;
	}

	public void setOrderCustomerDAO(OrderCustomerDAO orderCustomerDAO) {
		this.orderCustomerDAO = orderCustomerDAO;
	}
}
