package com.intellectdesign.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intellectdesign.springdemo.Service.CustomerService;
import com.intellectdesign.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	
	@GetMapping("/list")
	public String listCustomer(Model theModel) {
	
		
		// Get the Customer from DAO
		
		
		List<Customer> theCustomers=customerService.getCustomers();
		// add the customer to model 
		
		theModel.addAttribute("customers", theCustomers);
		
		
		
		return "listCustomer";
		
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showCustomer(Model theModel) {
		
		
	    Customer thecustomer= new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customer-form";
		
		
		
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		
		
		customerService.saveCustomer(theCustomer);
		
		
		return "redirect:/customer/list/";
		
		
		
		
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerID") int id, Model theModel) 
	{
		// Get the Customer from Database 
		
		Customer theCustomer =customerService.getCustomer(id);
		
		
		theModel.addAttribute("customer", theCustomer);
		
		
		return "customer-form";
		
		
		
		
	}

}
