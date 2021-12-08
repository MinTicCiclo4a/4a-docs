package com.citas.citas_ms.controllers;

import com.citas.citas_ms.exceptions.PersonaNotFoundException;
import com.citas.citas_ms.models.Persona;
import com.citas.citas_ms.models.ReservaCita;
import com.citas.citas_ms.repositories.PersonaRepository;
import com.citas.citas_ms.repositories.ReservaCitaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController

public class ReservaCitaController {

    private final PersonaRepository personaRepository;
    private final ReservaCitaRepository reservaCitaRepository;

    public ReservaCitaController(PersonaRepository personaRepository, ReservaCitaRepository reservaCitaRepository) {
        this.personaRepository = personaRepository;
        this.reservaCitaRepository = reservaCitaRepository;
    }

    @PostMapping("/reservaCitas")
    ReservaCita newReservaCita(@RequestBody ReservaCita reservaCita){
        Persona persona = personaRepository.findById(reservaCita.getDocumentPersona()).orElse(null);

        if (persona == null)
            throw new PersonaNotFoundException("No se encontro una Persona con el Documento: " + reservaCita.getDocumentPersona());

        return reservaCitaRepository.save(reservaCita);

    }

    @GetMapping("/reservaCitas/{document}")
    List<ReservaCita> userReservaCita(@PathVariable String document){
        Persona userPersona = personaRepository.findById(document).orElse(null);
        if (userPersona == null)
        throw new PersonaNotFoundException("No se encontro una Persona con el Documento: " + document);

        List<ReservaCita> reservaCita = reservaCitaRepository.findByDocumentPersona(document);



        return reservaCita;
    }
}





