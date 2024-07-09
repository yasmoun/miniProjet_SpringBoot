import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App.tsx";
import "./index.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import AboutUs from "./AboutUs.tsx";
import Connexion from "./Connexion.tsx";
import CreerCompte from "./CreerCompte.tsx";
import BAccueil from "./BAccueil.tsx";
import Adoption from "./Adoption.tsx";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
  },
  {
    path: "/AboutUs",
    element: <AboutUs />,
  },
  {
    path: "/login",
    element: <Connexion />,
  },
  {
    path: "/SignUp",
    element: <CreerCompte />,
  },
  {
    path: "/accueil/:email",
    element: <BAccueil />,
  },
  {
    path: "/adoption",
    element: <Adoption />,
  },
]);

ReactDOM.createRoot(document.getElementById("root") as HTMLElement).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
