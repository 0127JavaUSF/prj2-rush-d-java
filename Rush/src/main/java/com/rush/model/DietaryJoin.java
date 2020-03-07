package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="dietary_category_id")
	private Long dietaryCategoryId;

	
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

	public Long getDietaryCategoryId() {
		return dietaryCategoryId;
	}

	public void setDietaryCategoryId(Long dietaryCategoryId) {
		this.dietaryCategoryId = dietaryCategoryId;
	}

	@Override
	public String toString() {
		return "DietaryJoin [dessertJoin=" + dessertJoin + ", productsId=" + productsId + ", dietaryCategoryId="
				+ dietaryCategoryId + "]";
	}

	public DietaryJoin(Long dessertJoin, Long productsId, Long dietaryCategoryId) {
		super();
		this.dessertJoin = dessertJoin;
		this.productsId = productsId;
		this.dietaryCategoryId = dietaryCategoryId;
	}

	public DietaryJoin() {
	}
	
	
}
