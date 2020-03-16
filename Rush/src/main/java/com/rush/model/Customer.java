package com.rush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.rush.jview.DataView;

@Component
@Entity
@Table(name="customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {

	//Table columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonView(DataView.OrderView.class)
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
	private Double creditCardNumber;
	
	@Column(nullable=false)
	private Integer cvv;
	
	@Column(name="card_holder_name", nullable=false)
	private String cardHolderName;
	
	@Column(name="exp_date", nullable=false)
	private String expDate;

//	@OneToMany
//	@JoinColumn(name="cust_id")
//	private List<Order> order;


	//Getters and Setters
	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Double creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public Customer(Long custId, String fName, String lName, String password, String username, Double creditCardNumber,
			Integer cvv, String cardHolderName, String expDate) {
		super();
		this.custId = custId;
		this.fName = fName;
		this.lName = lName;
		this.password = password;
		this.username = username;
		this.creditCardNumber = creditCardNumber;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
		this.expDate = expDate;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
