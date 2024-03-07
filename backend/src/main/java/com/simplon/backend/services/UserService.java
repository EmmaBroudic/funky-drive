package com.simplon.backend.Services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.simplon.backend.database.Database;
import com.simplon.backend.entities.User;

@Service
public class UserService {
	
	public UUID create(User user) {
		return Database.addUser(user);
	}
	
	public User getUserById(UUID id) {
		return Database.getUserById(id);
	}

}
