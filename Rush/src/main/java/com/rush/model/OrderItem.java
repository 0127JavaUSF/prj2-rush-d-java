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
@Table(name="order_items")
public class OrderItem {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_items_id")
	private Long orderItemsId;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="item_price")
	private Integer itemPrice;

	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	
	//Getters and Setters
}
