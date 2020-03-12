package com.rush.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rush.model.Customer;
import com.rush.repos.CustomerDao;

@Service
public class CreateCustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public Customer createCustomer (Customer customer) {
		return this.customerDao.save(customer);
	}
}
