package com.learnspring.service;

import java.util.List;

import com.learnspring.model.Customer;
import com.learnspring.repository.CustomerRepository;
import com.learnspring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRespository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.learnspring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRespository.findAll();
	}
}
