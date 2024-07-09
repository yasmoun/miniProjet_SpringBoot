import { FunctionComponent, useEffect, useState } from "react";
import "./navbar.css";
import { getNomAndPrenomByEmail } from "./services/ProprietaireService";
import { useParams } from "react-router-dom";

const Navbar: FunctionComponent = () => {
  const { email } = useParams<{ email: string }>()!;
  const [nomPrenom, setNomPrenom] = useState<string>("");
useEffect(() => {
  console.log("Received Domaine:", email);
}, [email]);
 
  useEffect(() => {

    const fetchNomPrenom = async () => {
      try {
        const response = await getNomAndPrenomByEmail(email);                                                       
        setNomPrenom(response.data);
      } catch (error) {
        console.error(
          "Erreur lors de la récupération du nom et du prénom :",
          error
        );
      }
    };

    fetchNomPrenom();
  }, [email]);

  return (
    <div className="main-containery">
      <div className="rectangley">
        <div className="petc-mfy">
          <span className="py">P</span>
          <span className="ety">et</span>
          <span className="cy">C </span>
          <span className="et-1y">mf</span>
        </div>
        <div className="ellipsey"></div>
        <div className="vectory"></div>
        <span className="doua-mannai">{nomPrenom}</span>
      </div>
    </div>
  );
};

export default Navbar;