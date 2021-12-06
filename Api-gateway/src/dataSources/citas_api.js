const { RESTDataSource } = require("apollo-datasource-rest");
const serverConfig = require("../server");
class CitasAPI extends RESTDataSource {
  constructor() {
    super();
    this.baseURL = serverConfig.citas_api_url;
  }
  async createCita(reservaCitas) {
    reservaCitas = new Object(JSON.parse(JSON.stringify(reservaCitas)));

    return await this.post("/reservaCitas", reservaCitas);
  }
  async citaByid(idReserva) {
    return await this.get(`/reservaCitas/${idReserva}`);
  }

  
 
}
module.exports = CitasAPI;
