const reservaResolver = {
    Query: {
    reservaByUsername: async(_, { idPaciente }, { dataSources, userIdToken }) => {
            return dataSources.accountAPI.transactionByUsername(idPaciente)
     }
     },
    Mutation: {
    createReserva: async(_, { Idreserva }, { dataSources, userIdToken }) => {
        
            return dataSources.accountAPI.createReserva(Idreserva )
 
     }
     }
    };
    module.exports = reservaResolver;
    