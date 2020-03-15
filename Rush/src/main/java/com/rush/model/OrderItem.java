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
	private Integer itemPrice;

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

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
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

	//constructors
	public OrderItem(Long orderItemsId, Integer quantity, Integer itemPrice, Order order, Product product) {
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

	
	//to string
	@Override
	public String toString() {
		return "OrderItem [orderItemsId=" + orderItemsId + ", quantity=" + quantity + ", itemPrice=" + itemPrice
				+ ", order=" + order + ", product=" + product + "]";
	}

	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((orderItemsId == null) ? 0 : orderItemsId.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		OrderItem other = (OrderItem) obj;
		if (itemPrice == null) {
			if (other.itemPrice != null)
				return false;
		} else if (!itemPrice.equals(other.itemPrice))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (orderItemsId == null) {
			if (other.orderItemsId != null)
				return false;
		} else if (!orderItemsId.equals(other.orderItemsId))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
