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
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rush.jview.DataView;

@Entity
@Table(name="products")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="productJsonId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	@JsonView(DataView.ProductView.class)
	private Long productId;
	
	@Column(name="product_name")
	@JsonView(DataView.ProductView.class)
	private String productName;
	
	@Column(name="product_price")
	@JsonView(DataView.ProductView.class)
	private Integer productPrice;
	
	@Column(name="product_description")
	@JsonView(DataView.ProductView.class)
	private String productDescription;
	
	@Column(name="dietary_restrictions")
	@JsonView(DataView.ProductView.class)
	private String dietaryRestrictions;
	
	@Column(name="quantity_rem")
	@JsonView(DataView.ProductView.class)
	private Integer quantityRem;
	
	@Column(name="img_url")
	@JsonView(DataView.ProductView.class)
	private String imgUrl;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<OrderItem> orderItems;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dessert_category_id")
	@JsonView(DataView.ProductView.class)
	private DessertCategory dessertCategory;


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


	public String getDietaryRestrictions() {
		return dietaryRestrictions;
	}


	public void setDietaryRestrictions(String dietaryRestrictions) {
		this.dietaryRestrictions = dietaryRestrictions;
	}


	public Integer getQuantityRem() {
		return quantityRem;
	}


	public void setQuantityRem(Integer quantityRem) {
		this.quantityRem = quantityRem;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public List<OrderItem> getOrderItems() {
		return orderItems;
	}


	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}


	public DessertCategory getDessertCategory() {
		return dessertCategory;
	}


	public void setDessertCategory(DessertCategory dessertCategory) {
		this.dessertCategory = dessertCategory;
	}


	public Product(Long productId, String productName, Integer productPrice, String productDescription,
			String dietaryRestrictions, Integer quantityRem, String imgUrl, List<OrderItem> orderItems,
			DessertCategory dessertCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.dietaryRestrictions = dietaryRestrictions;
		this.quantityRem = quantityRem;
		this.imgUrl = imgUrl;
		this.orderItems = orderItems;
		this.dessertCategory = dessertCategory;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", dietaryRestrictions=" + dietaryRestrictions
				+ ", quantityRem=" + quantityRem + ", imgUrl=" + imgUrl + ", orderItems=" + orderItems
				+ ", dessertCategory=" + dessertCategory + "]";
	}

}
