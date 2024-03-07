import Header from '../../components/Header/Header.jsx';
import Folders from '../../components/Folders/Folders.jsx';
import './home.css';

function Home() {

    return (
        <div className="home-body">
            <Header />
            <Folders />
            <p>Hello world</p>
        </div>
    );
}

export default Home;