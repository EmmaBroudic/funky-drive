package com.simplon.backend.controller;

import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.model.User;
import com.simplon.backend.repository.UserRepository;
import com.simplon.backend.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> create(@RequestBody User user) {
		return service.createUser(user);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Collection<User>> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable @NonNull UUID id) {
		return service.getUserById(id);
	}
}
