package com.rush.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.rush.model.Customer;
import com.rush.model.LoginForm;

@Service
@Transactional

public class CustomerService {
	
	private SessionFactory sesFact;

	public void validateUser(LoginForm credentials) {


	}
	
	
	



}
