package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository <Paciente, String> { }