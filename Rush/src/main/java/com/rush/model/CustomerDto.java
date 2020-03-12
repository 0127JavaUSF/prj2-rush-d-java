package com.rush.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerDto {

	private Long custId;
	private String fName;
	private String lName;
	private String password;
	private String username;
	private Integer creditCardNumber;
	private Integer cvv;
	private String cardHolderName;
	private String expDate;
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
	@Override
	public String toString() {
		return "CustomerDto [custId=" + custId + ", fName=" + fName + ", lName=" + lName + ", password=" + password
				+ ", username=" + username + ", creditCardNumber=" + creditCardNumber + ", cvv=" + cvv
				+ ", cardHolderName=" + cardHolderName + ", expDate=" + expDate + "]";
	}
	public CustomerDto(Long custId, String fName, String lName, String password, String username,
			Integer creditCardNumber, Integer cvv, String cardHolderName, String expDate) {
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
	public CustomerDto() {
		super();
	}
	
	
}
