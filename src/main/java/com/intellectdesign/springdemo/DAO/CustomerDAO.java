package com.intellectdesign.springdemo.DAO;

import java.util.List;

import com.intellectdesign.springdemo.entity.Customer;

public interface CustomerDAO {
	
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);
	//Satish Changes


}
