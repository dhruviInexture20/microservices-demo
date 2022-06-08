package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.Account;
import com.microservice.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repo;
	
	@Override
	public Account create(Account account) {
		return repo.save(account);
	}

	@Override
	public Account getAccount(long accountid) {
		return repo.getDistinctByAccountid(accountid);
	}

}
