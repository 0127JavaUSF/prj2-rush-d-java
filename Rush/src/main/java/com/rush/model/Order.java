package com.rush.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rush.jview.DataView;

@Entity
@Table(name="orders")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="orderId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	@JsonView(DataView.OrderView.class)
	private Long orderId;
	
	@Column(name="order_date")
	@JsonView(DataView.OrderView.class)
	private String order_date;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@OneToMany
	@JoinColumn(name="order_id")
	private List<OrderItem> orderItems;

	
	//Getters and Setters
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	//constructors
	public Order(Long orderId, String order_date, Customer customer, List<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.order_date = order_date;
		this.customer = customer;
		this.orderItems = orderItems;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//to string
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", order_date=" + order_date + ", customer=" + customer + ", orderItems="
				+ orderItems + "]";
	}

	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}