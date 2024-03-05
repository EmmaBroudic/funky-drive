package com.simplon.backend.database;

import java.util.HashMap;
import java.util.UUID;

import com.simplon.backend.entities.User;

public class Database {
	private static HashMap<UUID, User> mapUser = new HashMap<>();
	
	public static UUID addUser(User user) {
		UUID newUserId = UUID.randomUUID();
		user.setId(newUserId);
		mapUser.put(user.getId(), user);
		return newUserId;
	}
	
	public static User getUserById(UUID id) {
		return mapUser.get(id);
	}
}
