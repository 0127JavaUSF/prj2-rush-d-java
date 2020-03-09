package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dietary_join")
public class DietaryJoin {

	//Table column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dessert_join")
	private Long dessertJoin;
	
	@Column(name="products_id")
	private Long productsId;
	
	@ManyToOne
	@JoinColumn(name="dietary_join_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="dietary_category_id")
	private DietaryCategory dietaryCategory;

	
	//Getters and Setters
	public Long getDessertJoin() {
		return dessertJoin;
	}

	public void setDessertJoin(Long dessertJoin) {
		this.dessertJoin = dessertJoin;
	}

	public Long getProductsId() {
		return productsId;
	}

	public void setProductsId(Long productsId) {
		this.productsId = productsId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public DietaryCategory getDietaryCategory() {
		return dietaryCategory;
	}

	public void setDietaryCategory(DietaryCategory dietaryCategory) {
		this.dietaryCategory = dietaryCategory;
	}

	
	//constructors
	public DietaryJoin(Long dessertJoin, Long productsId, Product product, DietaryCategory dietaryCategory) {
		super();
		this.dessertJoin = dessertJoin;
		this.productsId = productsId;
		this.product = product;
		this.dietaryCategory = dietaryCategory;
	}

	public DietaryJoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//to string
	@Override
	public String toString() {
		return "DietaryJoin [dessertJoin=" + dessertJoin + ", productsId=" + productsId + ", product=" + product
				+ ", dietaryCategory=" + dietaryCategory + "]";
	}

	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dessertJoin == null) ? 0 : dessertJoin.hashCode());
		result = prime * result + ((dietaryCategory == null) ? 0 : dietaryCategory.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((productsId == null) ? 0 : productsId.hashCode());
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
		DietaryJoin other = (DietaryJoin) obj;
		if (dessertJoin == null) {
			if (other.dessertJoin != null)
				return false;
		} else if (!dessertJoin.equals(other.dessertJoin))
			return false;
		if (dietaryCategory == null) {
			if (other.dietaryCategory != null)
				return false;
		} else if (!dietaryCategory.equals(other.dietaryCategory))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productsId == null) {
			if (other.productsId != null)
				return false;
		} else if (!productsId.equals(other.productsId))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
