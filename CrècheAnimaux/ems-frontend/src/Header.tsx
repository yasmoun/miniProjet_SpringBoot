import { FunctionComponent } from "react";
import "./Header.css";

const Header: FunctionComponent = () => {
  return (
    <div className="main-containere">
      <div className="frame">
        <div className="petc-mf">
          <span className="p">P</span>
          <span className="et">et</span>
          <span className="c">C </span>
          <span className="mf">mf</span>
        </div>
        <button className="rectangle"></button>
        <div className="vector"></div>
        <span className="connexion">
          <a href="/login">Connexion</a>
        </span>
        <span className="create-account">
          <a href="signUp">Créer un compte</a>
        </span>
        <span className="who-we-are">
          <a href="/AboutUs">Qui sommes-nous ?</a>
        </span>
      </div>
    </div>
  );
};

export default Header;
