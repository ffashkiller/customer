package com.jsp.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.CustomerDataManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

   public List<Customer>findByName(String Name);
	@Query("SELECT  c FROM Customer c WHERE c.name=:name AND c.email=:email")
	public List<Customer> validateCustomer(@Param("name")String name,@Param("email")String email);

}
