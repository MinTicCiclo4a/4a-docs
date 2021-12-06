const { gql } = require('apollo-server');
const CitaTypeDefs = gql `

    type citaInfo {
        idCita: String!
        especialidadCita: String!
        especialistaCita: String!
        diaCita: Date!
        sedeCita: String!
        consultorioCita: String!
    }
    input citaDetail {
        especialidadCita: String!
        especialistaCita: String!
        diaCita: Date!
        sedeCita: String!
        consultorioCita: String!
    }

    type Mutation {
        detailCita(citaInput: citaInfo): Cita!
    }
    type Query {
        citaById(citaId: String!): citaDetail!
    }
    `;
module.exports = CitaTypeDefs;
