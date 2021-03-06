package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.model.Customer;
import com.microservice.repository.CustomerRepository;
import com.microservice.voTemp.Account;
import com.microservice.voTemp.ResponseTemplate;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Autowired	
	private RestTemplate restTemplate;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return repo.save(customer);

	}

	@Override
	public Customer getCustomerDetails(long id) {

		return repo.getDistinctByUserid(id);
		
	}

	@Override
	public ResponseTemplate getCustomerAndAccount(long userid) {
		
		ResponseTemplate returnView = new ResponseTemplate();
		Customer customer = repo.getDistinctByUserid(userid);
		returnView.setCustomer(customer);
		
		Account account = restTemplate.getForObject("http://localhost:8002/account/get/"+ customer.getAccount_id() , Account.class);
		returnView.setAccount(account);
		return returnView;
	}
	
}
