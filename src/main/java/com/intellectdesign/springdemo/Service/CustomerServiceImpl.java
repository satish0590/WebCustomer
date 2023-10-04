package com.intellectdesign.springdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intellectdesign.springdemo.DAO.CustomerDAO;
import com.intellectdesign.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	
	@Autowired
	private CustomerDAO  customerDao;

	@Transactional
	public List<Customer> getCustomers() {

			
	List<Customer> theCustomers=customerDao.getCustomers();
		
		
		return theCustomers;
	}

	@Transactional
	public void saveCustomer(Customer theCustomer) {


		customerDao.saveCustomer(theCustomer);
		
		
	}

	@Transactional
	public Customer getCustomer(int id) {
		
	  Customer customer = customerDao.getCustomer(id);
		
		return customer;
	}

}
