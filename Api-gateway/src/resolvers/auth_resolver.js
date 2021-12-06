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
      const citasInput = {
        document: userInput.document,
        name: userInput.name,
        last_name: userInput.last_name,
        password: userInput.password,
        email: userInput.email,
        phone: userInput.phone,
        date_of_birth: userInput.date_of_birth,
        address: userInput.address,
        city: userInput.city,
      };
      
     return await dataSources.authAPI.createUser(citasInput);
    },
    logIn: (_, { credentials }, { dataSources }) =>
      dataSources.authAPI.authRequest(credentials),
    refreshToken: (_, { refresh }, { dataSources }) =>
      dataSources.authAPI.refreshToken(refresh),
  },
};
module.exports = usersResolver;
