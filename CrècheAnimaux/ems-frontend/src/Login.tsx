import { FunctionComponent, useState } from "react";
import "./login.css";
import { getAllProprietaires } from "./services/ProprietaireService";
import { useNavigate } from "react-router-dom";

const Login: FunctionComponent = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  const handleLogin = async () => {
    try {
      const response = await getAllProprietaires();
      const proprietaires = response.data;

      const proprietaire = proprietaires.find(
        (proprietaire :Proprietaire) =>
          proprietaire.email === email && proprietaire.password === password
      );

      if (proprietaire) {
        alert("Connexion réussie !");
        navigate(`/accueil/${email}`); 
      } else {
        alert("Email ou mot de passe incorrect");
      }
    } catch (error) {
      console.error("Erreur lors de la connexion :", error);
    }
  };

  return (
    <>
      <div className="main-container ">
        <div className="flex-row-eL">
          <div className="imaged">
            <div className="linee"></div>
          </div>
          <div className="rectangle-222">
            <span className="connexione">Connexion !</span>
            <span className="welcome-messagee">
              Bienvenue à nouveau! s’il vous plaît entrez vos coordonnées
            </span>
            <input
              type="email"
              className="email"
              style={{ background: "transparent", border: "none" }}
              placeholder="Email"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
            />
            <div className="line-6e"></div>
            <div className="flex-row-b">
              <input
                type="password"
                className="mot-de-passeM"
                style={{ background: "transparent", border: "none" }}
                placeholder="Mot de passe"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </div>
            <div className="line-8e"></div>
            <div className="flex-row-ea">
              <span className="mot-de-passe-oublie">Mot de passe oublié</span>
              <span className="souvenez-moi">souvenez moi</span>
              <input type="checkbox" className="rectangle-9" />
            </div>
            <button className="rectangle-a" onClick={handleLogin}>
              <div className="se-connecter">Se connecter</div>
            </button>
            <div className="creer-compte">
              <span className="pas-de-compte">Vous n'avez pas de compte !</span>
              <span className="create-accounte">
                <a href="/signUp">Créez-en un</a>
              </span>
            </div>
          </div>
          <div className="line-be"></div>
          <div className="pets-icon"></div>
          <div className="pets-icon-c"></div>
          <span className="return">
            <a href="/">Retour</a>
          </span>
          <div className="pets-icon-d"></div>
        </div>
      </div>
    </>
  );
};

export default Login;
