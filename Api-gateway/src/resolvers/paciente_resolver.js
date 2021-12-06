const pacienteResolver = {
    Query: {
        userbyId: (_, { identificacion }, { dataSources}) => {
                return dataSources.citas_API.getPaciente(identificacion)
           
        },
     },
    
    Mutation: {
        detailUser: async(_, { pacienteInput }, { dataSources }) => {
            const pacienteInput = {
                identificacion: pacienteInput.identificacion,
                primerNombre: pacienteInput.primerNombre,
                segundoNombre: pacienteInput.segundoNombre,
                primerApellido: pacienteInput.primerApellido,
                segundoApellido: pacienteInput.segundoApellido,
                fechaDeNacimiento: pacienteInput.fechaDeNacimiento,
                genero:pacienteInput.genero,
                estadoCivil: pacienteInput.estadoCivil,
                direccion: pacienteInput.direccion,
                ocupacion: pacienteInput.ocupacion,
                telefono: pacienteInput.telefono,
                nombreAcompañante: pacienteInput.nombreAcompañante
                
        }
            
        return await dataSources.citas_API.createPaciente(pacienteInput);
        }
    }
};

module.exports = pacienteResolver;