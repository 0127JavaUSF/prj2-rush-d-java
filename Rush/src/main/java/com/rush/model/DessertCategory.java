package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="dessert_category")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="dessertJsonId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

	public DessertCategory(Long dessertCategoryId, String categoryName) {
		super();
		this.dessertCategoryId = dessertCategoryId;
		this.categoryName = categoryName;
	}

	public DessertCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}