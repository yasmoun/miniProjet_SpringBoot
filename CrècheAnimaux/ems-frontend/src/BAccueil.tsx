import Accueil from "./Accueil";
import "./App.css";

import Navbar from "./Navbar";
import SousNavbar from "./SousNavbar";

function BAccueil() {
  return (
    <>
      <div>
        <Navbar></Navbar>
        <SousNavbar></SousNavbar>
        <Accueil></Accueil>
      </div>
    </>
  );
}

export default BAccueil;
