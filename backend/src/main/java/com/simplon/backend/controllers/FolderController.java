package com.simplon.backend.controllers;

import java.util.Collection;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.entities.Folder;
import com.simplon.backend.services.FolderService;

@RestController
@RequestMapping("/folder")
public class FolderController {
	
	private final FolderService service;
	
	public FolderController(FolderService service) {
		this.service = service;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody Folder folder) {
		return service.create(folder);
	}
		
		
	@GetMapping("/{id}")
	public Folder getFolderById(@PathVariable UUID id) {
		return service.getFolderById(id);
	}
	
	@GetMapping
	public Collection<Folder> getAllFolders() {
		return service.getAllFolders();
	}
}
