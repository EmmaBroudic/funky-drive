import Header from '../../components/Header/Header.jsx';
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './account.css';

function Account() {

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
    
    console.log(user);

    return (
        <div>
            <Header />

            <div className="account-body" key={user.id}>
                <h2>Mon compte</h2>
                <p className ="infos">Mon nom de famille</p>
                <p className ="infos-perso">{user.lastname}</p>
                <p className ="infos">Mon prénom</p>
                <p className ="infos-perso">{user.firstname}</p>
                <p className ="infos">Mon email</p>
                <p className ="infos-perso">{user.email}</p>
                <p className ="infos">Inscription depuis le </p>
                <p className ="infos-perso">6 mars 2024</p>
                <button>Modifier mes informations</button>
            </div>
        </div>
    );
}

export default Account;