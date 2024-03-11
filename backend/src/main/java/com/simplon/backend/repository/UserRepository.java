package com.simplon.backend.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.backend.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
	List<User> findByFirstnameContaining(String firstname);
}