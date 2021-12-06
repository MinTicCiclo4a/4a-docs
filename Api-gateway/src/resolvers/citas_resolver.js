const { gql } = require('apollo-server');

const CitaTypeDefs = gql `
    input citaInfo {
        id: String!
        nombreEspecialista: String!
        especialidad:String!
        sede:String!
        consultorio:String!

    }

    type citaDetail {
        id: String!
        nombreEspecialista: String!
        especialidad:String!
        sede:String!
        consultorio:String!
        }
    }
    type Mutation {
        detailCita(citaInput: citaInfo): cita!
    }
    type Query {
        citaByyId(citaId: String!): citaDetail!
    }
    `;
module.exports = CitaTypeDefs;