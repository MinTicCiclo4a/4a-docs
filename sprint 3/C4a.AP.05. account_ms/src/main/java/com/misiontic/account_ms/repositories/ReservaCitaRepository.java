package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.ReservaCita;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReservaCitaRepository extends MongoRepository <ReservaCita, String> {
    List<ReservaCita> findByEspecialidadCita (String EspecialidadCita);
}