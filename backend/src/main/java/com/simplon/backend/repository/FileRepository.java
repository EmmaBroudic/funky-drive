package com.simplon.backend.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.backend.entities.File;

public interface FileRepository extends JpaRepository<File, UUID> {
	List<File> findByFileContaining(String name);
}
