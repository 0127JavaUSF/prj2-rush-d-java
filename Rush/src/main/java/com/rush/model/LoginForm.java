package com.rush.model;

//used soley for request body of users to login with
public class LoginForm {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

}
