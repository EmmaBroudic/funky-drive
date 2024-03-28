package com.simplon.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.backend.model.File;

public interface FileRepository extends JpaRepository<File, Long> {
	List<File> findByNameContaining(String name);
}