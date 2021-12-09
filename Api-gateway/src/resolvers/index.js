const personaResolver = require("./persona_resolver");
const citasResolver = require("./citas_resolver");

const authResolver = require("./auth_resolver");
const lodash = require("lodash");
const resolvers = lodash.merge(
  personaResolver,
  citasResolver,
  authResolver
);
module.exports = resolvers;
