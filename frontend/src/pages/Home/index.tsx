import { ReactComponent as MainImage } from 'assets/images/main-image.svg'
import Navbar from "components/Navbar";

const Home = () => {
    return (
       <>
        <Navbar />
        <div className="home-container">
            <div className="home-card">
                <div className="home-content-container">
                    <h1>Conheça o melhor catálogo</h1>
                </div>
                <div className="home-image-container">
                    <MainImage />
                </div>
            </div>
        </div>
       </>
    );
  }

export default Home;
