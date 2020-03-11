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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="dietary_category")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="dietaryCatJsonId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DietaryCategory {

	//Table column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dietary_category_id")
	private Long dietaryCategoryId;
	
	@Column(name="dietary_name")
	private String dietaryName;

//	@OneToMany
//	@JoinColumn(name="dietary_category_id")
//	private List<DietaryJoin> dietaryJoins;
	
	//Getters and Setters
	
	public Long getDietaryCategoryId() {
		return dietaryCategoryId;
	}

	public void setDietaryCategoryId(Long dietaryCategoryId) {
		this.dietaryCategoryId = dietaryCategoryId;
	}

	public String getDietaryName() {
		return dietaryName;
	}

	public void setDietaryName(String dietaryName) {
		this.dietaryName = dietaryName;
	}

	public DietaryCategory(Long dietaryCategoryId, String dietaryName) {
		super();
		this.dietaryCategoryId = dietaryCategoryId;
		this.dietaryName = dietaryName;
	}

	public DietaryCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
