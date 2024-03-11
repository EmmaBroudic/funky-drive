package com.simplon.backend.services;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.simplon.backend.model.User;
import com.simplon.backend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> createUser(User user) {
        try {
            UUID newUserId = UUID.randomUUID();
            user.setId(newUserId);
            User savedUser = userRepository.save(user);

            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<User> getUserById(@NonNull UUID id) {
    	try {
    		Optional<User> userData = userRepository.findById(id);

    		if (userData.isPresent()) {
    			return new ResponseEntity<>(userData.get(), HttpStatus.OK);
    		} else {
    			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    		}
    	} catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }

	public ResponseEntity<Collection<User>> getAllUsers() {
        try {
            Collection<User> users = userRepository.findAll();
            
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
