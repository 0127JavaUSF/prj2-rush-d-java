package com.rush.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
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
import com.rush.utils.CustomerJWTUtil;
//http://localhost:4200
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/rush")

public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderRepo orderRepo;
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order, @CookieValue(value = "JWT", defaultValue="noCookie") String jwt) {
		
		
		try {
			if (!(CustomerJWTUtil.getCustIdOrNull(jwt).equals(null))) {
				logger.info("Saving Order");
				System.out.println("Contents of the order being submitted" + order.toString());
				
				return orderRepo.save(order);
				
			}
		}
		catch(NullPointerException e) {
			logger.error("Fail Seesion Initialization");	
		}
		return new Order();
//	    return ResponseEntity
//				.status(401)
//				.body("JWT token value invalid");//return the payload for client to utilize the userId for the session
//
//		
		

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
