import Header from '../../components/Header/Header.jsx';
import './account.css';

function Account() {
    return (
        <div>
            <Header />
            <div className="account-body">
                <h2>Mon compte</h2>
                <p className ="infos">Mon nom de famille</p>
                <p className ="infos-perso">Nooky</p>
                <p className ="infos">Mon prénom</p>
                <p className ="infos-perso">Isabelle</p>
                <p className ="infos">Mon email</p>
                <p className ="infos-perso">isabelle.nooky@husky.com</p>
                <p className ="infos">Inscription depuis le </p>
                <p className ="infos-perso">6 mars 2024</p>
                <button>Modifier mes informations</button>
            </div>
        </div>
    );
}

export default Account;