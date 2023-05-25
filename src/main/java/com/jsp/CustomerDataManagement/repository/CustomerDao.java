package com.jsp.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.CustomerDataManagement.entity.Customer;
import com.jsp.CustomerDataManagement.repository.CustomerRepository;
@Repository
public class CustomerDao {
	@Autowired
   private CustomerRepository cRepository;
   
   public Customer saveCustomer(Customer c) {
	   return cRepository.save(c);
   }
   
   public List<Customer> getallcustomers(){
	   return cRepository.findAll();
   }
   
   public Customer findCustomerById(int id) {
	   return cRepository.findById(id).orElse(
			   new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
   }
   
   public Customer DeleteCustomerById(int id) {
	   Customer c=findCustomerById(id);
	   cRepository.deleteById(id);
	   return c;
   }
	public List<Customer> getcustomerbyname(String Name){
		return  cRepository.findByName(Name);
	}
	public List<Customer> validateCustomer(String Name,String email){
		return cRepository.validateCustomer(Name, email);
	}
}
