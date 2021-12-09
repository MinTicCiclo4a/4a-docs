const citasResolver = {
  Query: {
    reservaCitaByDocument: async (_, { document }, { dataSources, userIdToken }) => {
      documentToken = (await dataSources.authAPI.getUser(userIdToken)).document;
      if (document == documentToken)
        return dataSources.citasAPI.reservaCitaByDocument(document);
      else return null;
    },
  },
  Mutation: {
    createReservaCita: async (_, { reservaCita }, { dataSources, userIdToken }) => {
      documentToken = (await dataSources.authAPI.getUser(userIdToken)).document;
      if (reservaCita.documentPersona == documentToken)
        return dataSources.citasAPI.createReservaCita(reservaCita);
      else return null;
    },
  },
};
module.exports = citasResolver;
