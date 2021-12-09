const personaResolver = {
  Query: {
    personaByDocument: async (_, { document }, { dataSources, userIdToken }) => {
        documentToken = (await dataSources.authAPI.getUser(userIdToken)).document;
      if (document == documentToken)
        return await dataSources.citasAPI.personaByDocument(document);
      else return null;
    },
  },

  Mutation: {},
};
module.exports = personaResolver;
