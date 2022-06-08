package com.microservice.service;

import com.microservice.model.Customer;
import com.microservice.voTemp.ResponseTemplate;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	Customer getCustomerDetails(long id);

	ResponseTemplate getCustomerAndAccount(long userid);
	
	
}
