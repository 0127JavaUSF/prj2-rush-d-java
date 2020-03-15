package com.rush.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rush.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	@Query("SELECT c FROM Product c WHERE c.dessertCategory = :cat")
	List<Product> findProductsInCat(@Param("cat") String dessertCategory);
	
}
