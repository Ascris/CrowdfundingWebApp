package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dto.OrderCustomerDTO;

@Entity
@Table(name = "OrderCustomer")
public class OrderCustomer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1905520946801663839L;

	@Id
	@Column(name = "orderCustomerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderCustomerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId")
	private Customer customer;

	@Column(name = "orderDate")
	private Date orderDate;

	public OrderCustomer() {

	}

	public OrderCustomer(final Long orderCustomerId, final Date orderDate) {
		this.orderCustomerId = orderCustomerId;
		this.orderDate = orderDate;
	}

	public OrderCustomer(final Long orderCustomerId, final Date orderDate, final Customer customer) {
		this(orderCustomerId, orderDate);
		this.customer = customer;
	}

	public Long getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(Long orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderCustomerDTO entity2DTO() {
		return new OrderCustomerDTO(orderCustomerId, orderDate);
	}
}
