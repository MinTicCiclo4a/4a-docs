//Se llama al typedef (esquema) de cada submodulo
const personaTypeDefs = require("./persona_type_defs");
const reservaCitaTypeDefs = require("./citas_type_defs");
const authTypeDefs = require("./auth_type_defs");
//Se unen
const schemasArrays = [authTypeDefs,personaTypeDefs, reservaCitaTypeDefs];
//Se exportan
module.exports = schemasArrays;
