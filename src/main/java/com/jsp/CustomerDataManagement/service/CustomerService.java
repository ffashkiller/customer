package com.jsp.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement.repository.CustomerDao;
import com.jsp.CustomerDataManagement.dto.CustomerDto;
import com.jsp.CustomerDataManagement.dto.ResponseStructure;
import com.jsp.CustomerDataManagement.entity.Customer;
import com.jsp.CustomerDataManagement.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDto dto) {
		Customer c = new Customer(dto);
		 Customer customer = dao.saveCustomer(c);
		 ResponseStructure<Customer> rs = new ResponseStructure<Customer>();
		 rs.setData(customer);
		 rs.setStatusCode(HttpStatus.OK.value());
		 rs.setTimeStamp(LocalDateTime.now());
		 rs.setMessage("data saved");
		 return rs;
	}
	public ResponseStructure<Customer> UpdateCustomer(Customer c) {
		Customer cu= dao.saveCustomer(c);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(cu);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	public ResponseStructure<List<Customer>> getAllCustomers(){
		List<Customer> list=dao.getallcustomers();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setData(list);
			rs.setStatusCode(HttpStatus.ACCEPTED.value());
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("customers entry found in database");
		}else {
			rs.setData(null);
			rs.setStatusCode(HttpStatus.ACCEPTED.value());
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("no customers entry found in database");
		}
		return rs;
	}

	public List<Customer> validateCustomer(String Name,String email){
		return dao.validateCustomer(Name, email);
	}
	public Customer findByCustomerId(int id) {
		return dao.findCustomerById(id);
	}
	public Customer DeleteCustomerById(int id) {
		return dao.DeleteCustomerById(id);
	}
	public List<Customer> getByName(String Name){
		return dao.getcustomerbyname(Name);
	}
}
