package com.rush.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
}