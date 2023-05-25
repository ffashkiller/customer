package com.jsp.CustomerDataManagement.dto;

import java.io.Serializable;

import com.jsp.CustomerDataManagement.entity.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class CustomerDto implements Serializable{

	private Integer id;
	private String name;
	private String email;
	public CustomerDto (Customer dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
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
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
