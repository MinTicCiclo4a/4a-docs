const { gql } = require('apollo-server');

const pacienteTypeDefs = gql `
    input pacienteInfo {
        identificacion: String!
        primerNombre: String!
        segundoNombre: String
        primerApellido: String!
        segundoApellido: String
        fechaDeNacimiento: Date!
        genero: String!
        estadoCivil: String!
        direccion: String!
        ocupacion: String!
        telefono: long!
        nombreAcompañante: String!,
    }

    type pacienteDetail {
        identificacion: String!
        primerNombre: String!
        segundoNombre: String
        primerApellido: String!
        segundoApellido: String
        fechaDeNacimiento: Date!
        genero: String!
        estadoCivil: String!
        direccion: String!
        ocupacion: String!
        telefono: long!
        nombreAcompañante: String!,
        }
    }
    type Mutation {
        detailUser(pacienteInput :pacienteInfo): Paciente!
    }
    type Query {
        pacienteById(identificacion: String!): pacienteDetail!
    }
    `;
module.exports =pacienteTypeDefs;