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
@Table(name="dietary_category")
public class DietaryCategory {

	//Table column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dietary_category_id")
	private Long dietaryCategoryId;
	
	@Column(name="dietary_name")
	private Long dietaryName;
	
	@OneToMany
	@JoinColumn(name="dietary_category_id")
	private List<DietaryJoin> dietaryJoins;
	
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

	//constructors
	public DietaryCategory(Long dietaryCategoryId, Long dietaryName) {
		super();
		this.dietaryCategoryId = dietaryCategoryId;
		this.dietaryName = dietaryName;
	}

	public DietaryCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	//to string
	@Override
	public String toString() {
		return "DietaryCategory [dietaryCategoryId=" + dietaryCategoryId + ", dietaryName=" + dietaryName + "]";
	}

	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dietaryCategoryId == null) ? 0 : dietaryCategoryId.hashCode());
		result = prime * result + ((dietaryJoins == null) ? 0 : dietaryJoins.hashCode());
		result = prime * result + ((dietaryName == null) ? 0 : dietaryName.hashCode());
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
		DietaryCategory other = (DietaryCategory) obj;
		if (dietaryCategoryId == null) {
			if (other.dietaryCategoryId != null)
				return false;
		} else if (!dietaryCategoryId.equals(other.dietaryCategoryId))
			return false;
		if (dietaryJoins == null) {
			if (other.dietaryJoins != null)
				return false;
		} else if (!dietaryJoins.equals(other.dietaryJoins))
			return false;
		if (dietaryName == null) {
			if (other.dietaryName != null)
				return false;
		} else if (!dietaryName.equals(other.dietaryName))
			return false;
		return true;
	}
	
	
	

	
}
