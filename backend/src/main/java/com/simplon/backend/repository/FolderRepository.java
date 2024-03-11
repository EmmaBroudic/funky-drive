package com.simplon.backend.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.backend.model.Folder;

public interface FolderRepository extends JpaRepository<Folder, UUID> {
	List<Folder> findByNameContaining(String name);
}
