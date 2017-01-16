package com.learnspring.repository;

import java.util.List;

import com.learnspring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}