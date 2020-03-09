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
	
	@Column(name="category_id")
	private Long categoryId;
	
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

	
	//constructors
	public Product(Long productId, String productName, Integer productPrice, String productDescription,
			Integer quantityRem, Long categoryId, String ingredients, List<OrderItem> orderItems,
			List<DietaryJoin> dietaryJoins, DessertCategory dessertCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.quantityRem = quantityRem;
		this.categoryId = categoryId;
		this.ingredients = ingredients;
		this.orderItems = orderItems;
		this.dietaryJoins = dietaryJoins;
		this.dessertCategory = dessertCategory;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//to string
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", quantityRem=" + quantityRem + ", categoryId="
				+ categoryId + ", ingredients=" + ingredients + ", orderItems=" + orderItems + ", dietaryJoins="
				+ dietaryJoins + ", dessertCategory=" + dessertCategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((dessertCategory == null) ? 0 : dessertCategory.hashCode());
		result = prime * result + ((dietaryJoins == null) ? 0 : dietaryJoins.hashCode());
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result + ((quantityRem == null) ? 0 : quantityRem.hashCode());
		return result;
	}

	
	//hashcode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
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
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
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
	
	
	
	
	
	
	
	
	
	
}
