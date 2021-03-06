package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	Account getDistinctByAccountid(long accountid);

}
