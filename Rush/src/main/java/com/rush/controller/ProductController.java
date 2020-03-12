package com.rush.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Product;
import com.rush.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rush")
public class ProductController {

	private ProductService productService;

	@Autowired
	public void ProductRepo(ProductService productService) {
		//super();
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return productService.getProduct();
	}
	
	
	
}
