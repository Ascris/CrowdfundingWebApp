package dto;

import java.util.Date;

import model.OrderCustomer;

public class OrderCustomerDTO {

	private Long orderCustomerId;

	private Date orderDate;

	public OrderCustomerDTO() {

	}

	public OrderCustomerDTO(final Long orderCustomerId, final Date orderDate) {
		this.orderCustomerId = orderCustomerId;
		this.orderDate = orderDate;
	}

	public Long getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(Long orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderCustomer DTO2Entity() {
		return new OrderCustomer(orderCustomerId, orderDate);
	}
}
