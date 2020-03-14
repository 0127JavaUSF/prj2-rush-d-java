package com.rush.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Order;
import com.rush.service.CheckoutService;


@RestController
@RequestMapping("/rush/OrderCheckout")
public class CheckOutController {
	
	Logger logger = LoggerFactory.getLogger(CheckOutController.class);
	
	@Autowired
	private CheckoutService checkOutService;
	
	@PostMapping("/Checkout")
	public ResponseEntity<String> newOrder (@RequestBody Order order) {
		logger.info("Creating order");
		checkOutService.createOrder(order);
		logger.info("Order created Successfully");
		return ResponseEntity.status(201).body("Thank you for your order");
	}

}
