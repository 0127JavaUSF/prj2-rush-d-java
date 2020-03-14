package com.rush.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Order;
import com.rush.repos.OrderRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/rush")

public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderRepo orderRepo;
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order) {
		logger.info("Saving Order");
		return orderRepo.save(order);
	}
	
	@GetMapping("/orders")
	public List<Order> getAllOrders(){
		logger.info("Retreive Order");
		return orderRepo.findAll();

	}
}
