package com.rush.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.rush.jview.DataView;
import com.rush.model.Order;
import com.rush.model.OrderItem;
import com.rush.repos.OrderRepo;
//http://localhost:4200

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/rush")

public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderRepo orderRepo;
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order) {
		logger.info("Saving Order");
		System.out.println("Contents of the order being submitted" + order.toString());
		
		return orderRepo.save(order);
	}
	
	@GetMapping("/orders/customer/{id}")
	@JsonView(DataView.OrderView.class)
	public List<Order> findCustOrders(@PathVariable(value="id") Long custId){
		return orderRepo.findAllCustomerOrders(custId);
	}
	
	@GetMapping("/orders/{id}")
	@JsonView(DataView.ItemView.class)
	public List<OrderItem> findOrderitems(@PathVariable(value="id") Long orderId){
		return orderRepo.findAllItemsInOrder(orderId);
	}
	
}
