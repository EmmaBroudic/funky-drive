package com.simplon.backend.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.entities.File;
import com.simplon.backend.services.FileService;

@RestController
@RequestMapping("/file")
public class FileController {
	
	private final FileService service;
	
	public FileController(FileService service) {
		this.service = service;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody File file) {
		return service.create(file);
	}
	
	@GetMapping("/{id}")
	public File getFileById(@PathVariable UUID id) {
		return service.getFileById(id);
	}
}
