package com.simplon.backend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "file")
public class File {
	
	@Id
	@Column(name = "id")
    private UUID id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "createdAt")
    private LocalDate createdAt;
    
    public File() {
    }
    
    public File(String name, LocalDate createdAt) {
		this.name = name;
		this.createdAt = createdAt;
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
	
	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", createdAt=" + createdAt + "]";
	}
}
