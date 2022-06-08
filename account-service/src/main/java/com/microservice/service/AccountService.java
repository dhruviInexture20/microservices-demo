package com.microservice.service;

import com.microservice.model.Account;

public interface AccountService {

	Account create(Account account);

	Account getAccount(long accountid);

}
