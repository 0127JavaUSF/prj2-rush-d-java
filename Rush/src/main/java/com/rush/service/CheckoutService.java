package com.rush.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rush.model.Order;
import com.rush.repos.OrderDao;

@Service
public class CheckoutService {
	
	private OrderDao orderDao;
	
	@Autowired
	public CheckoutService(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}


	public Order createOrder (Order order){
		return orderDao.save(order);
	}

}
