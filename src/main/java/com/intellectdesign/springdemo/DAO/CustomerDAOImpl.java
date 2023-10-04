package com.intellectdesign.springdemo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectdesign.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	// Inject Session Factory
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public List<Customer> getCustomers() {

          // get the hibernate session 
		
		Session session = sessionFactory.getCurrentSession();
		
		//  create a query
		
		
		Query<Customer>  theQuery = session.createQuery(" from Customer" , Customer.class);
		//execute a query and get list
		
		
		List<Customer>  customer= theQuery.getResultList();
		// return the result
		
		
		
		return customer;
	}


	public void saveCustomer(Customer theCustomer) {
		
		Session session = sessionFactory.getCurrentSession();
		
		
		session.saveOrUpdate(theCustomer);
		
	}


	public Customer getCustomer(int id) {
		
		
             Session session = sessionFactory.getCurrentSession();
		
		
		Customer theCustomer = session.get(Customer.class, id);
		
		
		return theCustomer;
	}


	
	
   

}
