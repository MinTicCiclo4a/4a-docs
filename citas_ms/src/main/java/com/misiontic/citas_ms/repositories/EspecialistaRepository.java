package com.misiontic.citas_ms.repositories;


import com.misiontic.citas_ms.models.Especialista;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialistaRepository extends MongoRepository<Especialista, String> {
}
