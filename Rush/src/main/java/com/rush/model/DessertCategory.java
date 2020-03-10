package com.rush.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dessert_category")
public class DessertCategory {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dessert_category_id")
	private Long dessertCategoryId;
	
	@Column(name="category_name")
	private String categoryName;

	@OneToMany
	@JoinColumn(name="dessert_category_id")
	private List<Product> products;

	
	//Getters and Setters
	public Long getDessertCategoryId() {
		return dessertCategoryId;
	}

	public void setDessertCategoryId(Long dessertCategoryId) {
		this.dessertCategoryId = dessertCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	//constructors
	public DessertCategory(Long dessertCategoryId, String categoryName, List<Product> products) {
		super();
		this.dessertCategoryId = dessertCategoryId;
		this.categoryName = categoryName;
		this.products = products;
	}

	public DessertCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//to string
	@Override
	public String toString() {
		return "DessertCategory [dessertCategoryId=" + dessertCategoryId + ", categoryName=" + categoryName
				+ ", products=" + products + "]";
	}

	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((dessertCategoryId == null) ? 0 : dessertCategoryId.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		DessertCategory other = (DessertCategory) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (dessertCategoryId == null) {
			if (other.dessertCategoryId != null)
				return false;
		} else if (!dessertCategoryId.equals(other.dessertCategoryId))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}
	
	
	
	
	
}