package com.misiontic.citas_ms.controllers;


import com.misiontic.citas_ms.exceptions.ReservaCitaNotFoundException;
import com.misiontic.citas_ms.models.ReservaCita;
import com.misiontic.citas_ms.repositories.ReservaCitaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservaCitaController {

    private final ReservaCitaRepository reservaCitaRepository;

    public ReservaCitaController(ReservaCitaRepository reservaCitaRepository) {
        this.reservaCitaRepository = reservaCitaRepository;
    }

    @GetMapping("/reservaCitas/{idReserva}")
    ReservaCita getReservaCita(@PathVariable String idReserva){
        return reservaCitaRepository.findById(idReserva)
                .orElseThrow(() -> new ReservaCitaNotFoundException("No se ha reservado la cita con id: " + idReserva));
    }

    @PostMapping("reservaCitas")
    ReservaCita newReservaCita(@RequestBody ReservaCita reservaCita){
        return reservaCitaRepository.save(reservaCita);
    }

}