const { gql } = require("apollo-server");

const reservaCitaTypeDefs = gql`
  type ReservaCita {
    id: String!
    documentPersona: String!
    especialidadCita: String!
    especialistaCita: String!
    diaCita: String!

  }
  input ReservaCitaInput {
    documentPersona: String!
    especialidadCita: String!
    especialistaCita: String!
    diaCita: String!
  }
  extend type Query {
    reservaCitaByDocument(document: String!): [ReservaCita]
  }
  extend type Mutation {
    createReservaCita(reservaCita: ReservaCitaInput!): ReservaCita
  }
`;
module.exports = reservaCitaTypeDefs;
