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
	
	@Column(name="ingredients")
	private String ingredients;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<OrderItem> orderItems;
	
	@OneToMany
	@JoinColumn(name ="dietary_join_id")
	private List<DietaryJoin> dietaryJoins;
	
	@ManyToOne
	@JoinColumn(name="dessert_category_id")
	private DessertCategory dessertCategory;

	
	//Getters and Setters
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantityRem() {
		return quantityRem;
	}

	public void setQuantityRem(Integer quantityRem) {
		this.quantityRem = quantityRem;
	}



	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public List<DietaryJoin> getDietaryJoins() {
		return dietaryJoins;
	}

	public void setDietaryJoins(List<DietaryJoin> dietaryJoins) {
		this.dietaryJoins = dietaryJoins;
	}

	public DessertCategory getDessertCategory() {
		return dessertCategory;
	}

	public void setDessertCategory(DessertCategory dessertCategory) {
		this.dessertCategory = dessertCategory;
	}

	
	
	
	
	
	
	
	
	
	
	
}
