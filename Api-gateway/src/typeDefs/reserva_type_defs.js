const { gql } = require('apollo-server');
const ReservaTypeDefs = gql `
    type Reserva {
        idReserva: String!
        idPaciente: long!
        especialidadCita: String!
        especialistaCita:  String!
        diaCita: Date !
    }
    input ReservaInput {
        idReserva: String!
        idPaciente: long!
        especialidadCita: String!
        especialistaCita:  String!
        diaCita: Date !
    }
    extend type Query {
    reservaByUsername(idPaciente: long!): [Reserva]
    }
    extend type Mutation {
    createReserva(reserva: ReservaInput!): Reserva
    }
`;
module.exports = ReservaTypeDefs;
