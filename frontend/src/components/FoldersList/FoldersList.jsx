import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './FolderList.css';

function FoldersList() {
  const [folders, setFolders] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/folder/all")
      .then(response => {
        setFolders(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);
  console.log(folders);
  return (
    <div className="folders-body">
      {folders.map(folder => (
        <div className="folder-card" key={folder.id}>{folder.name}</div>
      ))}
    </div>
  );
}



export default FoldersList;