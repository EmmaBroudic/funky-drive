import Header from '../../components/Header/Header.jsx';
import FoldersList from '../../components/FoldersList/FoldersList.jsx';
import FolderCard from '../../components/FolderCard/FolderCard.jsx';
import './home.css';

function Home() {

    return (
        <div className="home-body">
            <Header />
            <FoldersList />
            <FolderCard />
            <p>Hello world</p>
        </div>
    );
}

export default Home;