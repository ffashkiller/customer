package com.jsp.CustomerDataManagement.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.CustomerDataManagement.entity.Person;
import com.jsp.CustomerDataManagement.service.PersonService;

@RestController
public class Personcontroller {

	@Autowired
	private PersonService s;
	@PostMapping("/saveperson")
	public Person saveperson(@RequestBody Person p) {
		return s.saveperson(p);
	}
}
