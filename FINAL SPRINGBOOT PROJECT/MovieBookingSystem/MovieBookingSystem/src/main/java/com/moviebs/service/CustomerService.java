package com.moviebs.service;
import com.moviebs.model.*;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	Integer isCustomerPresent(Customer customer);
}
