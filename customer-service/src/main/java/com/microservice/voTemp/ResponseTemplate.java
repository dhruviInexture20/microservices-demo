package com.microservice.voTemp;

import com.microservice.model.Customer;

public class ResponseTemplate {

	private Customer customer;
	private Account account;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
