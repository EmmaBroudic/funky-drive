package com.simplon.backend.Services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.simplon.backend.database.Database;
import com.simplon.backend.entities.File;

@Service
public class FileService {

	public UUID create(File file) {
		return Database.addFile(file);
	}
	
	public File getFileById(UUID id) {
		return Database.getFileById(id);
	}
}
