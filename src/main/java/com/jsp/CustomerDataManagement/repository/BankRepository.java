package com.jsp.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.CustomerDataManagement.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer>{

}
