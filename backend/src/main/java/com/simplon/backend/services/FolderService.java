package com.simplon.backend.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.simplon.backend.model.Folder;
import com.simplon.backend.repository.FolderRepository;

@Service
public class FolderService {
	
    @Autowired
    private FolderRepository folderRepository;

    public ResponseEntity<Folder> createFolder(@NonNull Folder folder) {
        try {
            Folder savedFolder = folderRepository.save(folder);

            return new ResponseEntity<>(savedFolder, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Folder> getFolderById(@NonNull Long id) {
    	try {
    		Optional<Folder> folderData = folderRepository.findById(id);

    		if (folderData.isPresent()) {
    			return new ResponseEntity<>(folderData.get(), HttpStatus.OK);
    		} else {
    			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    		}
    	} catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }

	public ResponseEntity<Collection<Folder>> getAllFolders() {
        try {
            Collection<Folder> folders = folderRepository.findAll();
            
            if (folders.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(folders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}
}
