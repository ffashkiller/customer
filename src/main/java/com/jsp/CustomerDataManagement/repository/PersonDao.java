package com.jsp.CustomerDataManagement.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.CustomerDataManagement.entity.Person;

@Repository
public class PersonDao {
@Autowired
 private PersonRepository repository;

 public Person save(Person p) {
	return repository.save(p);
}
 
}
