package com.citas.citas_ms.repositories;

import com.citas.citas_ms.models.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, String> {


}
