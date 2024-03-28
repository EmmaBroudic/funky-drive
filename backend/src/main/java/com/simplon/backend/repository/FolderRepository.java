package com.simplon.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.backend.model.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {
	List<Folder> findByNameContaining(String name);
}
