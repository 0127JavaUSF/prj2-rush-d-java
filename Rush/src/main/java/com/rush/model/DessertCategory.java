package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Override
	public String toString() {
		return "DessertCategory [dessertCategoryId=" + dessertCategoryId + ", categoryName=" + categoryName + "]";
	}

	public DessertCategory(Long dessertCategoryId, String categoryName) {
		super();
		this.dessertCategoryId = dessertCategoryId;
		this.categoryName = categoryName;
	}

	public DessertCategory() {
	}
	
	
}
