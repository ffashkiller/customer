package com.jsp.CustomerDataManagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.CustomerDataManagement.dto.CustomerDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer_info")
public class Customer implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = true)
	private String name;
	private String email;
	

	public Customer(CustomerDto dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}


	public Customer(int value, String name2, String name3) {
		this.id=value;
		this.name=name2;
		this.email=name3;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		email = email;
	}
}
