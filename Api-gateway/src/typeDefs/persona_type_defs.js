const { gql } = require("apollo-server");
const personaTypeDefs = gql`
  type Persona {
     
    document: String!
    phone: Int!
    date_of_birth: String!
    address: String!
    city: String!

  }

  extend type Query {
    personaByDocument(document: String!): Persona
  }
`;
module.exports = personaTypeDefs;
