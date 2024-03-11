import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './UserAccount.css';

function UserAccount() {
  // Destructure the state variable and the setter function from the useState hook
  const [user, setUser] = useState({});

  useEffect(() => {
    axios.get("http://localhost:8080/user/c1eb81c3-662b-4419-bb1d-f70de3fa8996")
      .then(response => {
        // Update the user state with the data from the API response
        setUser(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);

  console.log(user); // Log the user state, not folders

  return (
    <div className="account-body">
      {/* Use user state directly, no need for the arrow function */}
      <li key={user.id}>
        <ul>{user.firstname}</ul>
        <ul>{user.lastname}</ul>
        <ul>{user.email}</ul>
      </li>
    </div>
  );
}

export default UserAccount;