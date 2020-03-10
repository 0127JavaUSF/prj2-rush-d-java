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
	@Column(name="dietary_join_id")
	private Long dietaryJoinId;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="dietary_category_id")
	private DietaryCategory dietaryCategory;

	//Getters and Setters
	public Long getDietaryJoinId() {
		return dietaryJoinId;
	}

	public void setDietaryJoinId(Long dietaryJoinId) {
		this.dietaryJoinId = dietaryJoinId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dietaryCategory == null) ? 0 : dietaryCategory.hashCode());
		result = prime * result + ((dietaryJoinId == null) ? 0 : dietaryJoinId.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
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
		if (dietaryCategory == null) {
			if (other.dietaryCategory != null)
				return false;
		} else if (!dietaryCategory.equals(other.dietaryCategory))
			return false;
		if (dietaryJoinId == null) {
			if (other.dietaryJoinId != null)
				return false;
		} else if (!dietaryJoinId.equals(other.dietaryJoinId))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DietaryJoin [dietaryJoinId=" + dietaryJoinId + ", product=" + product + ", dietaryCategory="
				+ dietaryCategory + "]";
	}

	public DietaryJoin(Long dietaryJoinId, Product product, DietaryCategory dietaryCategory) {
		super();
		this.dietaryJoinId = dietaryJoinId;
		this.product = product;
		this.dietaryCategory = dietaryCategory;
	}

	public DietaryJoin() {
	}

	


	
}