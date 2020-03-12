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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="products")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="productJsonId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	
	@Column(name="product_description")
	private String productDescription;
	
	@Column(name="quantity_rem")
	private Integer quantityRem;
	
<<<<<<< HEAD
	@Column(name="ingredients")
	private String ingredients;
=======
	@Column(name="img_url")
	private String imgUrl;
>>>>>>> b974b7837c3e6f25cb19d415a852c17e118f2012
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<OrderItem> orderItems;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<DietaryJoin> dietaryJoins;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dessert_category_id")
	private DessertCategory dessertCategory;

	
	//getters and setters
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

<<<<<<< HEAD


	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
=======
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
>>>>>>> b974b7837c3e6f25cb19d415a852c17e118f2012
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

<<<<<<< HEAD
	
	
	
	
	
	
	
	
	
	
=======
	public Product(Long productId, String productName, Integer productPrice, String productDescription,
			Integer quantityRem, String imgUrl, List<OrderItem> orderItems, List<DietaryJoin> dietaryJoins,
			DessertCategory dessertCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.quantityRem = quantityRem;
		this.imgUrl = imgUrl;
		this.orderItems = orderItems;
		this.dietaryJoins = dietaryJoins;
		this.dessertCategory = dessertCategory;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	



>>>>>>> b974b7837c3e6f25cb19d415a852c17e118f2012
	
}
