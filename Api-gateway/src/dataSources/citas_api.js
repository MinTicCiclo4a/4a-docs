const { RESTDataSource } = require('apollo-datasource-rest');
const serverConfig = require('../server');


class citasAPI extends RESTDataSource {
    constructor() {
    super();
    this.baseURL = serverConfig.citas_api_url;
     }
    async createPaciente(paciente) {
        paciente = new Object(JSON.parse(JSON.stringify(paciente)));
        return await this.post('/pacientes', paciente);
    }

    async getPaciente(identificacion) {
        return await this.get(`/pacientes/${identificacion}/`);
     }
     async createPaciente(especialista) {
        especialista = new Object(JSON.parse(JSON.stringify(especialista)));
        return await this.post('/especialistas', especialistas);
    }

    async getPaciente(especialistaId) {
        return await this.get(`/especialistas/${especialistaId}/`);
     }


    async createPaciente(cita) {
        cita = new Object(JSON.parse(JSON.stringify(cita)));
        return await this.post('/citas', cita);

    }
    async getPaciente(idCitas) {
        return await this.get(`/citas/${idCitas}/`);
    }
    async createTransaction(reservaCita) {
        reservaCita = new Object(JSON.parse(JSON.stringify(reservaCita)));
        return await this.post('/reservas', reservaCita);
         }

    async transactionByUsername(idReserva) {
        return await this.get(`/reservas/${idReserva}`);
         }
        
}
module.exports = citasAPI;
