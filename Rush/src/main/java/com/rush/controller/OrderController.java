package com.rush.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Order;
import com.rush.repos.OrderRepo;
//http://localhost:4200
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/rush")

public class OrderController {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order) {
		return orderRepo.save(order);
	}
	
	@GetMapping("/orders")
	public List<Order> getAllOrders(){
		return orderRepo.findAll();
	}
	
	@GetMapping("/orders/customer")
	public List<Order> findCustOrders(){
		return orderRepo.findAllCustomerOrders();
	}
}
