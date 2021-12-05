package com.misiontic.citas_ms.controllers;


import com.misiontic.citas_ms.exceptions.CitaNotFoundException;
import com.misiontic.citas_ms.models.Cita;
import com.misiontic.citas_ms.repositories.CitaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitaController {

    private final CitaRepository citaRepository;

    public CitaController(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @GetMapping("/citas/{idCita}")
    Cita getCita(@PathVariable String idCita){
        return citaRepository.findById(idCita)
                .orElseThrow(() -> new CitaNotFoundException("No se encontro una cita con el id: " + idCita));
    }

    @PostMapping("/citas")
    Cita newCita(@RequestBody Cita cita){
        return citaRepository.save(cita);
    }
}