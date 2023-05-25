package com.jsp.CustomerDataManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.CustomerDataManagement.entity.Person;
import com.jsp.CustomerDataManagement.repository.PersonDao;

@Service
public class PersonService {

	@Autowired
	private PersonDao d;
	public Person saveperson(Person p) {
		return d.save(p);
	}
}
