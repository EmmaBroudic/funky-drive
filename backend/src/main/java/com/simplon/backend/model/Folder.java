package com.simplon.backend.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "folder")
public class Folder {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "createdAt")
	private LocalDate createdAt;
	
	public Folder( ) {
	}
	
    public Folder(String name, LocalDate createdAt) {
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
		return "Folder [id=" + id + ", name=" + name + ", createdAt=" + createdAt + "]";
	}
}
