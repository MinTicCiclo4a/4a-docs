const { gql } = require("apollo-server");
const authTypeDefs = gql`
  type Tokens {
    refresh: String!
    access: String!
  }
  type Access {
    access: String!
  }
  input CredentialsInput {
    document: String!
    password: String!
  }
  input SignUpInput {
    document: String!
    password: String!
    name: String!
    email: String!
    phone: Int!
    date_of_birth: String!
    address: String!
    city: String!

   
  }
  type UserDetail {
    id: Int!
    document: String!
    password: String!
    name: String!
    email: String!
  }
  type Mutation {
    signUpUser(userInput: SignUpInput): Tokens!
    logIn(credentials: CredentialsInput!): Tokens!
    refreshToken(refresh: String!): Access!
  }
  type Query {
    userDetailById(userId: Int!): UserDetail!
  }
`;
module.exports = authTypeDefs;
