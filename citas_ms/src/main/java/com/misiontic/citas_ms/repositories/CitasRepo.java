package com.misiontic.citas_ms.repositories;

import com.misiontic.citas_ms.models.CitasDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitasRepo extends MongoRepository<CitasDAO, Integer> {
}
