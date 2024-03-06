import { NavLink } from 'react-router-dom';
import logo from '../../images/logo.jpg';
import './Header.css';

function Header() {
    return (
        <div className="header">
            <img src={logo} className="header-logo" alt="logo funky" />
            <nav>
                <NavLink className="menu-left" activeClassName="active" to="/home">Mon drive</NavLink>
                <NavLink className="menu-left" activeClassName="active" to="/account">Mon compte</NavLink>
                <NavLink className="menu-right" activeClassName="active" to="/login">Log out</NavLink>
            </nav>
        </div>
    )
}

export default Header;