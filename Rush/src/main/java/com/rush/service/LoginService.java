package com.rush.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rush.model.Customer;
import com.rush.model.LoginForm;
import com.rush.repos.LoginRepository;



@Service
public class LoginService {
	
	private LoginRepository loginRepository;
	
	public Customer validateUser(LoginForm loginForm) {
		System.out.println("At validation of user...\n\n\n\n");
		return this.loginRepository.findByUsernameAndPassword(loginForm.getUsername(), loginForm.getPassword());
	}
	
	
	@Autowired
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
}
