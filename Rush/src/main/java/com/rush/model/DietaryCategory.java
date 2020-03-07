package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dietary_category")
public class DietaryCategory {

	//Table column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dietary_category_id")
	private Long dietaryCategoryId;
	
	@Column(name="dietary_name")
	private Long dietaryName;

	
	//Getters and Setters
	public Long getDietaryCategoryId() {
		return dietaryCategoryId;
	}

	public void setDietaryCategoryId(Long dietaryCategoryId) {
		this.dietaryCategoryId = dietaryCategoryId;
	}

	public Long getDietaryName() {
		return dietaryName;
	}

	public void setDietaryName(Long dietaryName) {
		this.dietaryName = dietaryName;
	}

	public DietaryCategory(Long dietaryCategoryId, Long dietaryName) {
		super();
		this.dietaryCategoryId = dietaryCategoryId;
		this.dietaryName = dietaryName;
	}

	public DietaryCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DietaryCategory [dietaryCategoryId=" + dietaryCategoryId + ", dietaryName=" + dietaryName + "]";
	}
	

	
}
