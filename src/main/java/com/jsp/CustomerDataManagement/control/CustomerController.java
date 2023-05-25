package com.jsp.CustomerDataManagement.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement.dto.CustomerDto;
import com.jsp.CustomerDataManagement.dto.ResponseStructure;
import com.jsp.CustomerDataManagement.entity.Customer;
import com.jsp.CustomerDataManagement.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@PostMapping(value = "/savedsave")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody   CustomerDto dto) {
		return customerService.saveCustomer(dto);
	}
	@PutMapping(value = "/savedj")
	public @ResponseBody ResponseStructure<Customer> updateCustomer(@RequestBody   Customer customer) {
		return customerService.UpdateCustomer(customer);
	}
	@GetMapping(value = "/savedp")
	public @ResponseBody ResponseStructure<List<Customer>>  getCustomers() {
		return customerService.getAllCustomers();
	}
	@GetMapping(value = "/savedjf/{p}")
	public Customer getcustomerbyid(@PathVariable("p") int id) {
		return customerService.findByCustomerId(id);
	}
	@DeleteMapping( "saved")
	public Customer deletecustomerbyid(@RequestParam("id") int id) {
		return customerService.DeleteCustomerById(id);
	}
	@GetMapping(value = "/saved/{p}")
	public @ResponseBody List<Customer> getcustomername(@PathVariable("Name") String name) {
		return customerService.getByName(name);
	}
	@PostMapping("/validate")
	public List<Customer> validateCustomer(@RequestParam("Name")String name,@RequestParam("email")String email){
		return customerService.validateCustomer(name,email);
	}
}
