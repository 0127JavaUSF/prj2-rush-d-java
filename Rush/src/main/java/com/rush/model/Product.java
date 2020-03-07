package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", quantityRem=" + quantityRem + ", categoryId="
				+ categoryId + ", ingredients=" + ingredients + "]";
	}

	public Product(Long productId, String productName, Integer productPrice, String productDescription,
			Integer quantityRem, Long categoryId, String ingredients) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.quantityRem = quantityRem;
		this.categoryId = categoryId;
		this.ingredients = ingredients;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
