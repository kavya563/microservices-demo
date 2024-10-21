package com.example.springgatewaydemo1.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;




@Document(	collection = "user")
@Data
public class User {

	@Id
	private String id;


	private String username;


	private String email;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}







}