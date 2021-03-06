package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Customer;
import com.microservice.service.CustomerService;
import com.microservice.voTemp.ResponseTemplate;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer ) {
		System.out.println(customer.getName());
		return service.saveCustomer(customer);
	}
	
	@GetMapping("/view/{id}")
	public Customer getCustomer(@PathVariable long id) {
		return service.getCustomerDetails(id);
	}
	
	@GetMapping("getCustomerAndAccount/{userid}")
	public ResponseTemplate getCustomerWithAccount(@PathVariable long userid) {
		return service.getCustomerAndAccount(userid);
	}
	
	
	
}
