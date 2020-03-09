package com.rush.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rush.model.DessertCategory;

@Repository
public interface ProdCatDao extends CrudRepository<DessertCategory, Long>{
	
}
