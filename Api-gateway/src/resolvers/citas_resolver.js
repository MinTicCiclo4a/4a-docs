const citasResolver = {
  Query: {
    citaByid: async (_,{ document },{ dataSources, userIdToken }) => {
      usernameToken = (await dataSources.authAPI.getUser(userIdToken)).document;
      if (document == usernameToken)
        return await dataSources.citasAPI.citasByUsername(document);
      else return null;
    },
  },

  
  

};
module.exports = citasResolver ;
