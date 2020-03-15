package com.rush.model;

import java.util.List;

import javax.persistence.CascadeType;
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
	//@JsonView(DataView.OrderView.class)
	@JsonView(DataView.ItemView.class)
	private Long orderId;
	
	@Column(name="order_date")
	//@JsonView(DataView.OrderView.class)
	@JsonView(DataView.ItemView.class)
	private String order_date;

	@Column(name="order_total")
	//@JsonView(DataView.OrderView.class)
	@JsonView(DataView.ItemView.class)
	private Double orderTotal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL)
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

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
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

	public Order(Long orderId, String order_date, Double orderTotal, Customer customer, List<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.order_date = order_date;
		this.orderTotal = orderTotal;
		this.customer = customer;
		this.orderItems = orderItems;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}