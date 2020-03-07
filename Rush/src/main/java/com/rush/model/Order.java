package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="cust_id")
	private Long cust_id;
	
	@Column(name="order_date")
	private String order_date;

	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	//Getters and Setters
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cust_id=" + cust_id + ", order_date=" + order_date + "]";
	}

	public Order(Long orderId, Long cust_id, String order_date) {
		super();
		this.orderId = orderId;
		this.cust_id = cust_id;
		this.order_date = order_date;
	}

	public Order() {

	}

	
}
