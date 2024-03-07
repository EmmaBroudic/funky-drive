CREATE TABLE "account" (
    id UUID PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE "folder" (
    id UUID PRIMARY KEY,
    name VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    parent_folder UUID,
    account_id UUID,
    FOREIGN KEY (account_id) REFERENCES account (id)
);

CREATE TABLE "file" (
    id UUID PRIMARY KEY,
    name VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    folder_id UUID,
    account_id UUID,
    FOREIGN KEY (folder_id) REFERENCES folder (id),
    FOREIGN KEY (account_id) REFERENCES account (id)
);