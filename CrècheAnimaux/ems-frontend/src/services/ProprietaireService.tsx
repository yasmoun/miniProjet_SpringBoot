import axios from "axios";
const REST_API_BASE_URL = "http://localhost:8080/proprietaire";
export const addProprietaire = (proprietaire :Proprietaire) => {
  return axios.post(REST_API_BASE_URL, proprietaire);
};
export const getAllProprietaires = () => axios.get(REST_API_BASE_URL);
export const getNomAndPrenomByEmail = (email: Proprietaire) =>
  axios.get(REST_API_BASE_URL + "/" + email);


