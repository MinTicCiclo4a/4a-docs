const especialistaResolver = {
    Query: {
        especialistabyId: (_, { especialistaId }, { dataSources}) => {
                return dataSources.citas_API.getEspecialista(especialistaId)
           
        },
     },
    
    Mutation: {
        detailEspecialista: async(_, { especialistaInput }, { dataSources }) => {
            const especialistaInput = {
                id: especialistaInput.id,
                nombreEspecialista: especialistaInput.nombreEspecialista,
                especialidad:especialistaInput.especialidad,
                sede:especialistaInput.sede,
                consultorio:especialistaInput.consultorio
        }
            
        return await dataSources.citas_API.createEspecialista(especialistaInput);
        }
    }
};

module.exports = especialistaResolver;