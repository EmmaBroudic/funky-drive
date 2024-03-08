package com.simplon.backend.services;

// import java.util.Collection;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.simplon.backend.database.Database;
import com.simplon.backend.entities.Folder;

@Service
public class FolderService {

	public UUID create(Folder folder) {
		return Database.addFolder(folder);
	}
	
	public Folder getFolderById(UUID id) {
		return Database.getFolderById(id);
	}
	
	/*public Collection<Folder> getAllFolders() {
		return Database.getAllFolders();
	}*/
}
