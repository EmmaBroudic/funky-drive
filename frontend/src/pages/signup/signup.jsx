import './signup.css';

function Signup() {
    return (
        <div className="signup-body">
            <h2>Sign up</h2>
            <form action="/submit" method="post">
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

export default Signup;