package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Account;
import com.microservice.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	
	@Autowired
	AccountService service;
	
	@GetMapping("/create")
	Account createAccount(@RequestBody Account account) {
		return service.create(account);
	}
	
	@GetMapping("/get/{accountid}")
	Account getAccountDetails(@PathVariable long accountid) {
		return service.getAccount(accountid);
	}
}
