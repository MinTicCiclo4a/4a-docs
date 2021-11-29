package com.misiontic.citas_ms.repositories;


import com.misiontic.citas_ms.models.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
}
