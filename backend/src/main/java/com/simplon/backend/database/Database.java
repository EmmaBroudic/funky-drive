package com.simplon.backend.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import com.simplon.backend.model.*;

public class Database {
	private static HashMap<UUID, User> mapUser = new HashMap<>();
	private static HashMap<UUID, File> mapFile = new HashMap<>();
	private static HashMap<UUID, Folder> mapFolder = new HashMap<>();
	
	public static UUID addUser(User user) {
		UUID newUserId = UUID.randomUUID();
		user.setId(newUserId);
		mapUser.put(user.getId(), user);
		return newUserId;
	}
	
	public static User getUserById(UUID id) {
		return mapUser.get(id);
	}
	
	public static UUID addFile(File file) {
		UUID newFileId = UUID.randomUUID();
		file.setId(newFileId);
		mapFile.put(file.getId(), file);
		return newFileId;
	}
	
	public static File getFileById(UUID id) {
		return mapFile.get(id);
	}
	
    public static Collection<File> getAllFiles() {
        return mapFile.values();
    }
	
	public static UUID addFolder(Folder folder) {
		UUID newFolderId = UUID.randomUUID();
		folder.setId(newFolderId);
		mapFolder.put(folder.getId(), folder);
		return newFolderId;
	}
	
	public static Folder getFolderById(UUID id) {
		return mapFolder.get(id);
	}
	
    public static Collection<Folder> getAllFolders() {
        return mapFolder.values();
    }
}
