package com.simplon.backend.services;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.simplon.backend.model.File;
import com.simplon.backend.repository.FileRepository;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public ResponseEntity<File> createFile(File file) {
        try {
            UUID newFileId = UUID.randomUUID();
            file.setId(newFileId);
            File savedFile = fileRepository.save(file);

            return new ResponseEntity<>(savedFile, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<File> getFileById(@NonNull UUID id) {
    	try {
    		Optional<File> fileData = fileRepository.findById(id);

    		if (fileData.isPresent()) {
    			return new ResponseEntity<>(fileData.get(), HttpStatus.OK);
    		} else {
    			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    		}
    	} catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }

	public ResponseEntity<Collection<File>> getAllFiles() {
        try {
            Collection<File> files = fileRepository.findAll();
            
            if (files.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(files, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}