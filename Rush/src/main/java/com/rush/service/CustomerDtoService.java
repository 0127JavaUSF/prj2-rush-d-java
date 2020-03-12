package com.rush.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rush.model.CustomerDto;
import com.rush.utils.PasswordUtil;

@Service
public class CustomerDtoService {

	@Autowired
	private CustomerDto customerDto;
	
	@Autowired
	private PasswordUtil passwordUtil;

	public CustomerDto createCustomerDto (CustomerDto customerDto) {
		String salt = "rushdessert";
		String hashedpass = passwordUtil.generateSecurePassword(customerDto.getPassword(), salt);
		customerDto.setPassword(hashedpass);
		return this.customerDto;
		
	}

}
