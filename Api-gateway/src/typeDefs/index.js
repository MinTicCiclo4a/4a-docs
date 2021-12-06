//Se llama al typedef (esquema) de cada submodulo
const citaTypeDefs = require("./citas_type_defs");
const authTypeDefs = require("./auth_type_defs");
//Se unen
const schemasArrays = [authTypeDefs, citaTypeDefs];
//Se exportan
module.exports = schemasArrays;
