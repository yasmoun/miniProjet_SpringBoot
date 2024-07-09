
import "./accueil.css";

const Accueil: React.FC =() => {


  return (
    <div className="main-container">
      <div className="flex-row-e">
        <div className="solar-list-line-duotone">
          <div className="group">
            <div className="vector-5"></div>
            <div className="vector-6"></div>
            <div className="vector-7"></div>
          </div>
        </div>
        <div className="rectangle-8">
          <span className="publie-par">Publié(e) par </span>
          <div className="flex-row-f">
            <div className="ellipse-9"></div>
            <span className="yasmine-gannouni">Yasmine Gannouni</span>
          </div>
          <span className="une-petite-visite">
            Une petite visite des enfants sans soutien à notre crèche ; ils
            passent de bons moments avec les animaux, vivant une expérience
            inoubliable et pleine de joie.
          </span>
          <div className="flex-row-e-a">
            <div className="rectangle-b">
              <input
                type="text"
                placeholder="commentaire"
                className="commentaire"
                style={{ border: "none", background: "transparent" }}
              />
              <div className="vector-c"></div>
            </div>
            <div className="iconamoon-star-thin">
              <div className="vector-d"></div>
            </div>
            <div className="icon-star-thin">
              <div className="vector-e"></div>
            </div>
            <div className="icon-star-thin-f">
              <div className="vector-10"></div>
            </div>
            <div className="icon-star-thin-11">
              <div className="vector-12"></div>
            </div>
          </div>
        </div>
        <div className="rectangle-13">
          <span className="published-by">Publié(e) par </span>
          <div className="flex-row-b">
            <div className="ellipse-14"></div>
            <span className="mohamed-abidi">Mohamed Abidi</span>
          </div>
          <span className="small-walk-with-chaochao">
            Une petite promenade avec Chaochao, elle vous adresse un salut et
            vous dit : "Détendez-vous des commandes et profitez de la vie".
          </span>
          <div className="flex-row-cbf">
            <div className="rectangle-15">
              <input
                type="text"
                placeholder="commentaire"
                className="comment"
                style={{ border: "none", background: "transparent" }}
              />
              <div className="vector-16"></div>
            </div>
            <div className="icon-star-thin-17">
              <div className="vector-18"></div>
            </div>
            <div className="star-thin">
              <div className="vector-19"></div>
            </div>
            <div className="star-thin-1a">
              <div className="vector-1b"></div>
            </div>
            <div className="star-thin-1c">
              <div className="vector-1d"></div>
            </div>
          </div>
        </div>
        <div className="rectangle-1e">
          <span className="publie-par-1f">Publié(e) par </span>
          <div className="flex-row">
            <div className="ellipse-20"></div>
            <span className="manar-chorfi">Manar Chorfi</span>
          </div>
          <span className="petit-dejeuner">
            Petit déjeuner avec nos chats, une douce complicité enveloppe la
            pièce, chaque ronronnement semblant murmurer : "Savourons ce moment
            ensemble, dans la tranquillité et la simplicité".
          </span>
          <div className="flex-row-cec">
            <div className="rectangle-21">
              <input
                type="text"
                placeholder="commentaire"
                className="commentaire-22"
                style={{ border: "none", background: "transparent" }}
              />
              <div className="vector-23"></div>
            </div>
            <div className="star-thin-24">
              <div className="vector-25"></div>
            </div>
            <div className="star-thin-26">
              <div className="vector-27"></div>
            </div>
            <div className="star-thin-28">
              <div className="vector-29"></div>
            </div>
            <div className="star-thin-2a">
              <div className="vector-2b"></div>
            </div>
          </div>
        </div>
        <div className="right-arrow"></div>
      </div>
      <span className="publications-recentes">Publications récentes :</span>
      <div className="flex-row-ac">
        <div className="image"></div>
        <div className="image-2c"></div>
        <div className="image-2d"></div>
      </div>
    </div>
  );
};

export default Accueil;
