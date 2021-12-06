const { gql } = require("apollo-server");
const citaTypeDefs = gql`
  type Cita {
    idReserva: String! 
    document: String!
    especialidadCita: String!
    especialistaCita: String!
    diaCita: String!

  }
  extend type Query {
    citaByid(document: String!): Cita
  }
`;
module.exports = citaTypeDefs;
