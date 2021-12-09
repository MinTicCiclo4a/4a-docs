const { RESTDataSource } = require("apollo-datasource-rest");

const serverConfig = require("../server");

class CitasAPI extends RESTDataSource {
  
  constructor() {
    super();
    this.baseURL = serverConfig.citas_api_url;
  }
  async createPersona(persona) {
    persona = new Object(JSON.parse(JSON.stringify(persona)));

    return await this.post("/Personas", persona);
  }

  async personaByDocument(document) {
    return await this.get(`/Personas/${document}`);
     }

  async createReservaCita(reservaCita) {
    reservaCita = new Object(JSON.parse(JSON.stringify(reservaCita)));

    return await this.post("/reservaCitas", reservaCita);
  }

  async reservaCitaByDocument(document) {
    return await this.get(`/reservaCitas/${document}`);
  }

  
 
}
module.exports = CitasAPI;
