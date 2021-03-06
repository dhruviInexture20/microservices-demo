package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer getDistinctByUserid(long id);

}
