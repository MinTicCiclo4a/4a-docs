package com.example.citas_ms.repositories;


import com.example.citas_ms.models.ReservaCita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaCitaRepository extends MongoRepository <ReservaCita, String> {
    List<ReservaCita> findByIdReserva (String idReserva);
}