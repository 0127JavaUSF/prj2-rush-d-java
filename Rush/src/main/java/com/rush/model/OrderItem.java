package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class OrderItem {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_items")
	private Long orderItems;
	
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="product_id")
	private Integer quantity;
	
	@Column(name="item_price")
	private Integer itemPrice;

	
	//Getters and Setters
	public Long getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Long orderItems) {
		this.orderItems = orderItems;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItems=" + orderItems + ", orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + ", itemPrice=" + itemPrice + "]";
	}

	public OrderItem(Long orderItems, Long orderId, Long productId, Integer quantity, Integer itemPrice) {
		super();
		this.orderItems = orderItems;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	public OrderItem() {
	}
	

	
	
}
