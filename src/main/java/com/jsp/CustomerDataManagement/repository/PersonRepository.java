package com.jsp.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
