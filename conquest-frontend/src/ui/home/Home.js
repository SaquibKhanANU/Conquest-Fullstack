import "./Home.css";
import React from "react";
import ChooseNameForm from "./ChooseNameForm";
import BackgroundImage from "../../assets/imgs/background_img.png";

const Home = () => {
    return (
        <div className="home-container" style={{ backgroundImage: `url(${require('../../assets/imgs/background_img.png')})` }}>
            <div className="home-body">
                <ChooseNameForm />
            </div>
        </div>
    )
};

export default Home;
