package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.rush.jview.DataView;

@Entity
@Table(name="order_items")
public class OrderItem {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_items_id")
	@JsonView(DataView.ItemView.class)
	private Long orderItemsId;
	
	@Column(name="quantity")
	@JsonView(DataView.ItemView.class)
	private Integer quantity;
	
	@Column(name="item_price")
	@JsonView(DataView.ItemView.class)
	private Double itemPrice;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonView(DataView.ItemView.class)
	@JoinColumn(name="order_id")
	private Order order;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_id")
	@JsonView(DataView.ItemView.class)
	private Product product;

	//Getters and Setters
	public Long getOrderItemsId() {
		return orderItemsId;
	}

	public void setOrderItemsId(Long orderItemsId) {
		this.orderItemsId = orderItemsId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderItem(Long orderItemsId, Integer quantity, Double itemPrice, Order order, Product product) {
		super();
		this.orderItemsId = orderItemsId;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
		this.order = order;
		this.product = product;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
