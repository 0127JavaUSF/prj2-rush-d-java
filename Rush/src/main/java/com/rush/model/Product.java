package com.rush.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private Integer productPrice;
	
	@Column(name="production_description")
	private String productDescription;
	
	@Column(name="quantity_rem")
	private Integer quantityRem;
	
	@Column(name="category_id")
	private Long categoryId;
	
	@Column(name="ingredients")
	private String ingredients;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<OrderItem> orderItems;
	
	//Getters and Setters
	}
