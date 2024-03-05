package com.simplon.backend.entities;

import java.time.LocalDate;
import java.util.UUID;

public class User {
	private UUID id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private LocalDate createdAt;
	
	public User() {
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LocalDate getCreatedAt() {
		return this.createdAt;
	}
	
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}
