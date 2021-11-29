package com.misiontic.citas_ms.repositories;

import com.misiontic.citas_ms.models.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository <Cita, String> {
}
