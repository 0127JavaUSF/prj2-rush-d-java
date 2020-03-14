package com.rush.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.rush.jview.DataView;
import com.rush.model.Product;
import com.rush.repos.ProductRepo;
import com.rush.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rush")
public class ProductController {

	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	private ProductService productService;
	@Autowired
	private ProductRepo productRepo;

	@Autowired
	public void ProductRepo(ProductService productService) {
		//super();
		this.productService = productService;
	}
	
	@GetMapping("/products")
	@JsonView(DataView.ProductView.class)
	public List<Product> getProduct() {
		logger.info("Retrieve Produ0ct list");
		return productService.getProduct();
	}
	
	@GetMapping("products/{id}")
	@JsonView(DataView.ProductView.class)
	public ResponseEntity<Product>
	getProductById(@PathVariable(value="id") Long productId){
		Optional<Product> product = productRepo.findById(productId);
		Product prod = product.get();
		logger.info("ProductID ", prod.getProductId());
		return ResponseEntity.ok().body(prod);	
	}
	
	
	
}
