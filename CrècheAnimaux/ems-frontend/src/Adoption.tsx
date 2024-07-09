import "./App.css";
import FormAdoption from "./FormAdoption";

import Navbar from "./Navbar";
import SousNavbar from "./SousNavbar";

function Adoption() {
  return (
    <>
      <div>
        <Navbar></Navbar>
        <SousNavbar></SousNavbar>
        <FormAdoption></FormAdoption>
      </div>
    </>
  );
}

export default Adoption;
