package com.intellectdesign.springdemo.Service;

import java.util.List;

import com.intellectdesign.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);

}
