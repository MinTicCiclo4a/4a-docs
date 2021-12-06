const { gql } = require('apollo-server');

const especialistaTypeDefs = gql `
    input especialistaInfo {
        id: String!
        nombreEspecialista: String!
        especialidad:String!
        sede:String!
        consultorio:String!

    }

    type especialistaDetail {
        id: String!
        nombreEspecialista: String!
        especialidad:String!
        sede:String!
        consultorio:String!
        }
    }
    type Mutation {
        detailEspecialista(especialistaInput: especialistaInfo): especialista!
    }
    type Query {
        especialistaById(especialistaId: String!): especialistaDetail!
    }
    `;
module.exports = especialistaTypeDefs;