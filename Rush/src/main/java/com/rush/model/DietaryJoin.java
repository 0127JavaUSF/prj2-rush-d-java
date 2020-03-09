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
}
