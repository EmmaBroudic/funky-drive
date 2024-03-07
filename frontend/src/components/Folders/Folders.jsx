import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Folders() {
  const [folders, setFolders] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/folder")
      .then(response => {
        setFolders(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);
  console.log(folders);
  return (
    <ul>
      {folders.map(folder => (
        <li key={folder.id}>{folder.name}</li>
      ))}
    </ul>
  );
}



export default Folders;