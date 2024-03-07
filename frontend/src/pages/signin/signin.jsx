//import React from 'react';
import './signin.css';

function Signin() {
    return (
        <div className="signin-body">
            <h2>Sign in</h2>
            <form action="/submit" method="post">
                <div>
                    <label htmlFor="firstname">Name:</label>
                    <input type="text" id="firstname" name="firstname" required />
                </div>
                <div>
                    <label htmlFor="lastname">Name:</label>
                    <input type="text" id="lastname" name="lastname" required />
                </div>
                <div>
                    <label htmlFor="email">Email:</label>
                    <input type="email" id="email" name="email" required />
                </div>
                <div>
                    <label htmlFor="password">Password:</label>
                    <input type="password" id="password" name="password" required />
                </div>
                <div>
                    <button type="submit">Submit</button>
                </div>
            </form>
        </div>
    );
}

export default Signin;