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

import com.simplon.backend.model.File;
import com.simplon.backend.repository.FileRepository;
import com.simplon.backend.services.FileService;

@RestController
@RequestMapping("/file")
public class FileController {
	
	private final FileService service;
	
	public FileController(FileService service) {
		this.service = service;
	}
	
	@Autowired
	FileRepository fileRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<File> createFile(@RequestBody File file) {
		return service.createFile(file);
	}

	@GetMapping("/all")
	public ResponseEntity<Collection<File>> getAllFiles() {
	    return service.getAllFiles();
	}

	@GetMapping("/{id}")
	public ResponseEntity<File> getFileById(@PathVariable @NonNull UUID id) {
		return service.getFileById(id);
	}
}
