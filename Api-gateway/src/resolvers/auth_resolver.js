const usersResolver = {
  Query: {
    userDetailById: (_, { userId }, { dataSources, userIdToken }) => {
      if (userId == userIdToken) 
        return dataSources.authAPI.getUser(userId);
      else 
        return null;
    },
  },
  Mutation: {
    signUpUser: async (_, { userInput }, { dataSources }) => {
      const personaInput = {
        document: userInput.document,
        phone: userInput.phone,
        date_of_birth: userInput.date_of_birth,
        address: userInput.address,
        city: userInput.city,
        
      }
      await dataSources.citasAPI.createPersona(personaInput);
      
      const authInput = {
        document: userInput.document,
        password: userInput.password,
        name: userInput.name,
        email: userInput.email,
      };
      return await dataSources.authAPI.createUser(authInput);
    },
  
    logIn: (_, { credentials }, { dataSources }) =>
      dataSources.authAPI.authRequest(credentials),
    refreshToken: (_, { refresh }, { dataSources }) =>
      dataSources.authAPI.refreshToken(refresh),
  },
};
module.exports = usersResolver;
