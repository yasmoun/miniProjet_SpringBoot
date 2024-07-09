import { FunctionComponent } from "react";
import "./formAdoption.css";

const FormAdoption: FunctionComponent = () => {
  return (
    <div className="main-container">
      <div className="rectangle-3m">
        <span className="elargir-famille">Élargissez votre famille</span>
        <div className="rectangle-4m">
          <div className="imagem"></div>
          <span className="prenom">Prénom :</span>
          <span className="nom">Nom :</span>
          <input type="text" className="rectangle-box" />
          <input type="text" className="rectangle-box-5" />
          <span className="phone-number">Numéro du téléphone :</span>
          <span className="address">Adresse :</span>
          <input type="text" className="rectangle-box-6" />
          <input type="text" className="rectangle-box-7" />
          <span className="adoption-motivation">
            Motivation de l'adoption :
          </span>
          <input type="textarea" className="rectangle-8m" />
          <button className="bengal-cat-breed">Bengal cat breed</button>
        </div>
        <button className="rectangle-9m">
          <span className="adopterm">
            <a href="adoptionPage.html">Adopter</a>
          </span>
        </button>
        <div className="bx-right-arrow"></div>
      </div>
      <div className="linem"></div>
      <div className="line-am"></div>
    </div>
  );
};

export default FormAdoption;
