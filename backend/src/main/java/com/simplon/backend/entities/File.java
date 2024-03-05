package com.simplon.backend.entities;

import java.time.LocalDate;
import java.util.UUID;

public class File {
    private UUID id;
    private String name;
    private LocalDate createdAt;
    
    public File() {
    }
    
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getCreatedAt() {
		return this.createdAt;
	}
	
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}
