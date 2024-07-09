import { FunctionComponent } from "react";
import "./sousNavbar.css";

const SousNavbar: FunctionComponent = () => {
  return (
    <div className="main-containeryy">
      <div className="frameyy">
        <button className="rectangle-2yy"></button>
        <span className="accueil-3yy">
          <a href="/accueil">Accueil</a>
        </span>
        <span className="adoptionyy">
          <a href="/adoption">Adoption</a>
        </span>
        <span className="passer-une-reservationyy">
          <a href="/reservation">Passer une réservation</a>
        </span>
      </div>
    </div>
  );
};

export default SousNavbar;