package com.rush.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rush.model.Product;
import com.rush.repos.ProductRepo;

@Service
public class ProductService {

	private ProductRepo productRepo;
	
	@Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	public List<Product> getProduct() {
		return productRepo.findAll();
	}
	
	
}
