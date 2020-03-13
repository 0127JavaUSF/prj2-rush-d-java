package com.rush.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Product;
import com.rush.repos.ProductRepo;
import com.rush.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rush")
public class ProductController {

	private ProductService productService;
	@Autowired
	private ProductRepo productRepo;

	@Autowired
	public void ProductRepo(ProductService productService) {
		//super();
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return productService.getProduct();
	}
	
	@GetMapping("products/{id}")
	public ResponseEntity<Product>
	getProductById(@PathVariable(value="id") Long productId){
		Optional<Product> product = productRepo.findById(productId);
		Product prod = product.get();
		return ResponseEntity.ok().body(prod);	
	}
	
	
	
}
