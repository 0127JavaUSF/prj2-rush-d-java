package com.rush.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cust_id")
	private Long custId;
	
	@Column(name="fname", nullable=false)
	private String fName;
	
	@Column(name="lname", nullable=false)
	private String lName;
	
	@Column(nullable=false)
	private String password;
	
	@Column(unique=true, nullable=false)
	private String username;
	
	@Column(name="credit_card_number", nullable=false)
	private Integer creditCardNumber;
	
	@Column(nullable=false)
	private Integer cvv;
	
	@Column(name="card_holder_name", nullable=false)
	private String cardHolderName;
	
	@Column(name="exp_date", nullable=false)
	private String expDate;
	
	
	@OneToMany
	@JoinColumn(name="cust_id")
	private List<Order> order;
	
	
	//Getters and Setters
}
