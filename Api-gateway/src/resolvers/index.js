const citasResolver = require("./citas_resolver");

const authResolver = require("./auth_resolver");
const lodash = require("lodash");
const resolvers = lodash.merge(
  citasResolver,
  authResolver
);
module.exports = resolvers;
