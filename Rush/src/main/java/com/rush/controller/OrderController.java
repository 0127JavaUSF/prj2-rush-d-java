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

import com.fasterxml.jackson.annotation.JsonView;
import com.rush.jview.DataView;
import com.rush.model.Order;
import com.rush.repos.OrderRepo;
//http://localhost:4200
@CrossOrigin(origins="*")
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
	@JsonView(DataView.OrderView.class)
	public List<Order> findCustOrders(){
		return orderRepo.findAllCustomerOrders();
	}
}
