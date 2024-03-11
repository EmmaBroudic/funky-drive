package com.simplon.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.backend.model.File;
import com.simplon.backend.repository.FileRepository;
import com.simplon.backend.services.FileService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/file")
public class FileController {
	
	private final FileService service;
	
	public FileController(FileService service) {
		this.service = service;
	}
	
	@Autowired
	FileRepository fileRepository;
	
	@SuppressWarnings("null")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<File> createFile(@RequestBody File file) {
		try {
			File _file = fileRepository
					.save(new File(file.getName(), file.getCreatedAt()));
			return new ResponseEntity<>(_file, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@SuppressWarnings("null")
	@GetMapping("/all-files")
	public ResponseEntity<List<File>> getAllFiles(@RequestParam(required = false) String name) {
		try {
			List<File> files = new ArrayList<File>();
			
			if (name == null)
				fileRepository.findAll().forEach(files::add);
			else fileRepository.findByNameContaining(name).forEach(files::add);
			
			if (files.isEmpty()) {
				new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
			return new ResponseEntity<>(files, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public File getFileById(@PathVariable UUID id) {
		return service.getFileById(id);
	}
}
