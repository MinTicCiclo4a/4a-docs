const { gql } = require("apollo-server");
const citaTypeDefs = gql`
  type Cita {
     
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
