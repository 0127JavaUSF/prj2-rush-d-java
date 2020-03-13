package com.rush.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rush.model.Customer;
import com.rush.model.CustomerDto;
import com.rush.service.CreateCustomerService;
import com.rush.service.CustomerDtoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping ("/rush")
public class CustomerController {

	@Autowired
	private CreateCustomerService createCustomerService;
		
	@Autowired
	private CustomerDtoService customerDtoService;
	
	@Autowired
	private Customer customer;
	
	
	@PostMapping("/customer")
	public Customer newCustomer (@RequestBody CustomerDto customerDto) {
		customerDtoService.createCustomerDto(customerDto);
		BeanUtils.copyProperties(customerDto, customer);
		return createCustomerService.createCustomer(customer);
	}

}
