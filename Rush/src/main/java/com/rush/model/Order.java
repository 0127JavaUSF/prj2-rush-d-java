package com.rush.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="order_date")
	private String order_date;

	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@OneToMany
	@JoinColumn(name="order_id")
	private List<OrderItem> orderItems;
	//Getters and Setters
	
}