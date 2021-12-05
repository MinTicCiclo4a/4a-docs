package com.misiontic.citas_ms.repositories;


import com.misiontic.citas_ms.models.ReservaCita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaCitaRepository extends MongoRepository<ReservaCita, String> {

    List <ReservaCita> findByEspecialidadCita (String especialidadCita);
}
