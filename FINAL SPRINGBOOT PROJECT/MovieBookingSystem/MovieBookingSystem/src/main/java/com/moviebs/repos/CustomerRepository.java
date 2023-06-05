package com.moviebs.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebs.model.*;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	
	public Customer getCustomerByEmailAndName(String email,String name);

}