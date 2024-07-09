import { FormEvent, useState } from "react";
import "./signUp.css";
import { addProprietaire } from "./services/ProprietaireService";
import { useNavigate } from "react-router-dom";
const SignUp = () => {
  const [nomP, setNom] = useState("");
  const [prenomP, setPrenom] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [adresse, setAdresse] = useState("");
  const [num, setNumeroTelephone] = useState("");

  const navigate = useNavigate();

  function saveProprietaire(e: FormEvent) {
    e.preventDefault();
    const proprietaire = { email, nomP, prenomP, adresse, password, num };
    console.log(proprietaire)
    addProprietaire(proprietaire)
      .then((response) => {
        console.log(response.data);
        alert("ajout avec succèss!");
        navigate("/login");
      })
      .catch((error) => {
        console.error(
          "Erreur lors de l'enregistrement du propriétaire :",
          error
        );
      });
  }

  return (
    <div className="main-container">
      <div className="ddflex-row-d">
        <div className="rectangle-2">
          <span className="ddcreate-account">Créer un compte !</span>
          <form>
            <div className="ddflex-row-f">
              <input
                value={nomP}
                onChange={(e) => setNom(e.target.value)}
                type="text"
                className="name"
                style={{ background: "transparent", border: "none" }}
                placeholder="Nom"
                required
              />
              <input
                type="text"
                value={prenomP}
                onChange={(e) => setPrenom(e.target.value)}
                style={{ background: "transparent", border: "none" }}
                placeholder="Prénom"
                className="ddfirst-name"
                required
              />
              <div className="dline"></div>
              <div className="dline-3"></div>
            </div>
            <div className="ddflex-row">
              <input
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                style={{ background: "transparent", border: "none" }}
                placeholder="Email"
                className="demail"
                required
              />
              <input
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                style={{ background: "transparent", border: "none" }}
                placeholder="Mot de passe"
                className="dmot-de-passe"
                required
              />
              <input
                type="number"
                value={num}
                onChange={(e) => setNumeroTelephone(e.target.value)}
                style={{ background: "transparent", border: "none" }}
                placeholder="Numéro du téléphone"
                className="numTel"
                required
              />
              <div className="dline-5"></div>
              <div className="dline-10"></div>
              <div className="dline-6"></div>
              <div className="dline9"></div>
            </div>
            <span className="dminimum-8-characters">
              *doit comporter au moins 8 caractères
            </span>

            <input
              type="text"
              value={adresse}
              onChange={(e) => setAdresse(e.target.value)}
              style={{ background: "transparent", border: "none" }}
              placeholder="Adresse"
              className="adressed"
              required
            />

            <div className="rectangle-8e">
              <span className="ddcreer-un-compte">
                <button
                  type="submit"
                  className="ddcreer-un-compte"
                  onClick={saveProprietaire}
                >
                  Créer un compte
                </button>
              </span>
            </div>
          </form>
          <div className="dexisting-account">
            <span className="dexisting-account-9">
              Vous avez déjà un compte?{" "}
            </span>
            <span className="dlogin">
              <a href="/login">Se connecter</a>
            </span>
          </div>
        </div>
        <div className="dimage"></div>
        <div className="ddashicons-pets"></div>
        <div className="ddashicons-pets-a">
          <div className="vector-b"></div>
        </div>
        <div className="pets"></div>
        <div className="pets-c"></div>
        <div className="pets-d"></div>
        <div className="dimage-e"></div>
        <div className="pets-f"></div>
        <div className="pets-10"></div>
        <div className="pets-11"></div>
        <div className="pets-12"></div>
        <span className="retour">
          <a href="index.html">Retour</a>
        </span>
        <div className="pets-13"></div>
      </div>
    </div>
  );
};

export default SignUp;
