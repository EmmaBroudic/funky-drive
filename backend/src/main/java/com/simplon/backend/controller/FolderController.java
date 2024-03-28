package com.simplon.backend.controller;

import java.util.Collection;

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

import com.simplon.backend.model.Folder;
import com.simplon.backend.repository.FolderRepository;
import com.simplon.backend.services.FolderService;

@RestController
@RequestMapping("/folder")
public class FolderController {
	
	private final FolderService service;
	
	public FolderController(FolderService service) {
		this.service = service;
	}
	
	@Autowired
	FolderRepository folderRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Folder> create(@RequestBody @NonNull Folder folder) {
		return service.createFolder(folder);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Collection<Folder>> getAllFolders() {
		return service.getAllFolders();
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<Folder> getFolderById(@PathVariable @NonNull Long id) {
		return service.getFolderById(id);
	}
}
