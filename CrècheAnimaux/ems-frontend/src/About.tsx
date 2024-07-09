import { FunctionComponent } from "react";
import "./about.css";

const About: FunctionComponent = () => {
  return (
    <>
      <div className="main-container">
        <span className="qui-sommes-nous-1">Qui sommes nous ?</span>
        <span className="a-propos-de-nous">À propos de nous</span>
        <span className="creche-securisee-pour-animaux">
          Crèche sécurisée pour animaux : plaisir et soins assurés pendant votre
          absence.
        </span>
        <div className="flex-row-ee">
          <span className="avec-notre-equipe-devouee">
            Avec notre équipe dévouée et passionnée, nous nous engageons à
            offrir à vos animaux les meilleurs soins et beaucoup d'amour.
            Faites-nous confiance pour prendre soin de votre précieux animal
            comme s'il était le nôtre.
          </span>
          <div className="imageP"></div>
        </div>
        <div className="widescreen-cute-bunny"></div>
        <div className="line"></div>
      </div>
    </>
  );
};

export default About;