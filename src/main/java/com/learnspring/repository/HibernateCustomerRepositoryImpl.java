package com.learnspring.repository;

import java.util.ArrayList;
import java.util.List;

import com.learnspring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.learnspring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Fortune");
		customer.setLastname("Ekeruo");

		customers.add(customer);

		return customers;
	}

}
