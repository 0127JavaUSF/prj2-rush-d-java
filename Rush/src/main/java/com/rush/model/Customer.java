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
	public Integer getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(Integer creditCardNumber) {
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
	public Customer(Long custId, String fName, String lName, String password, String username, Integer creditCardNumber,
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
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", fName=" + fName + ", lName=" + lName + ", password=" + password
				+ ", username=" + username + ", creditCardNumber=" + creditCardNumber + ", cvv=" + cvv
				+ ", cardHolderName=" + cardHolderName + ", expDate=" + expDate + "]";
	}

	
	
}
