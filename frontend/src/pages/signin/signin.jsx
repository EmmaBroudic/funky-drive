//import React from 'react';
import './signin.css';

function Signin() {
    return (
        <div className="signin-body">
            <h2>Sign in</h2>
            <form action="/submit" method="post">
                <div>
                    <label htmlFor="name">Name:</label>
                    <input type="text" id="name" name="name" required />
                </div>
                <div>
                    <label htmlFor="email">Email:</label>
                    <input type="email" id="email" name="email" required />
                </div>
                <div>
                    <button type="submit">Submit</button>
                </div>
            </form>
        </div>
    );
}

export default Signin;