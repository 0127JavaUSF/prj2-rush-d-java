package com.rush.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rush.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long> {

}
