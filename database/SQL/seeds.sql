-- Seeds pour la table "account"
INSERT INTO account (id, firstname, lastname, email, password, created_at) VALUES
('a1f6e43c-4c04-4e51-bd44-7cfd69d52a0a', 'John', 'Doe', 'john.doe@example.com', 'password123', CURRENT_TIMESTAMP),
('e3d2ba95-ec09-4b87-ae0d-7502b3e0f7d8', 'Jane', 'Smith', 'jane.smith@example.com', 'pass123', CURRENT_TIMESTAMP),
('24a0cb65-8505-4f46-b315-024a7cf9afcc', 'Alice', 'Johnson', 'alice.johnson@example.com', 'qwerty', CURRENT_TIMESTAMP);

-- Seeds pour la table "folder"
INSERT INTO folder (id, name, created_at, parent_folder, account_id) VALUES
('f12cf30a-bd5e-4f62-a169-95349a86a7b7', 'Documents', CURRENT_TIMESTAMP, NULL, 'a1f6e43c-4c04-4e51-bd44-7cfd69d52a0a'),
('a4fb3e55-b238-49e2-aa97-9d4c0f2d9f53', 'Photos', CURRENT_TIMESTAMP, NULL, 'a1f6e43c-4c04-4e51-bd44-7cfd69d52a0a'),
('9bd36f10-7c69-4932-aaae-6346c44f4710', 'Work', CURRENT_TIMESTAMP, NULL, 'e3d2ba95-ec09-4b87-ae0d-7502b3e0f7d8');

-- Seeds pour la table "file"
INSERT INTO file (id, name, created_at, folder_id, account_id) VALUES
('fdad3cc5-d6f2-4d7b-9b8f-6b27e1283c65', 'resume.pdf', CURRENT_TIMESTAMP, 'f12cf30a-bd5e-4f62-a169-95349a86a7b7', 'a1f6e43c-4c04-4e51-bd44-7cfd69d52a0a'),
('8b7fa3c1-5c0a-41f3-bcce-52acdd96e441', 'family_photo.jpg', CURRENT_TIMESTAMP, 'a4fb3e55-b238-49e2-aa97-9d4c0f2d9f53', 'a1f6e43c-4c04-4e51-bd44-7cfd69d52a0a'),
('db8c7a3d-611d-4c33-9a6f-91a3a6f142b2', 'presentation.pptx', CURRENT_TIMESTAMP, '9bd36f10-7c69-4932-aaae-6346c44f4710', 'e3d2ba95-ec09-4b87-ae0d-7502b3e0f7d8');