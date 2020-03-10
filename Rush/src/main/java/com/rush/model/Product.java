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
	
	@Column(name="product_description")
	private String productDescription;
	
	@Column(name="quantity_rem")
	private Integer quantityRem;
	
	@Column(name="img_url")
	private String imgUrl;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<OrderItem> orderItems;
	
	@OneToMany
	@JoinColumn(name="product_id")
	private List<DietaryJoin> dietaryJoins;
	
	@ManyToOne
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dessertCategory == null) ? 0 : dessertCategory.hashCode());
		result = prime * result + ((dietaryJoins == null) ? 0 : dietaryJoins.hashCode());
		result = prime * result + ((imgUrl == null) ? 0 : imgUrl.hashCode());
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result + ((quantityRem == null) ? 0 : quantityRem.hashCode());
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
		Product other = (Product) obj;
		if (dessertCategory == null) {
			if (other.dessertCategory != null)
				return false;
		} else if (!dessertCategory.equals(other.dessertCategory))
			return false;
		if (dietaryJoins == null) {
			if (other.dietaryJoins != null)
				return false;
		} else if (!dietaryJoins.equals(other.dietaryJoins))
			return false;
		if (imgUrl == null) {
			if (other.imgUrl != null)
				return false;
		} else if (!imgUrl.equals(other.imgUrl))
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice == null) {
			if (other.productPrice != null)
				return false;
		} else if (!productPrice.equals(other.productPrice))
			return false;
		if (quantityRem == null) {
			if (other.quantityRem != null)
				return false;
		} else if (!quantityRem.equals(other.quantityRem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", quantityRem=" + quantityRem + ", imgUrl=" + imgUrl
				+ ", orderItems=" + orderItems + ", dietaryJoins=" + dietaryJoins + ", dessertCategory="
				+ dessertCategory + "]";
	}

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

	}

	

	
	
}
