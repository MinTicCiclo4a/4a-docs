package com.citas.citas_ms.repositories;

import com.citas.citas_ms.models.ReservaCita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaCitaRepository extends MongoRepository<ReservaCita, String> {


    List<ReservaCita> findByDocumentPersona (String documentPersona);
}
