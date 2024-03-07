import './login.css';
import { Link } from 'react-router-dom';

function Login() {
    return (
         <div className="login-body">
            <Link to="/signin"><button>Sign in</button></Link>
            <Link to="/signup"><button>Sign up</button></Link>
         </div>
    );
}

export default Login;
