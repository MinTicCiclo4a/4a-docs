package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository <Cita, String> { }