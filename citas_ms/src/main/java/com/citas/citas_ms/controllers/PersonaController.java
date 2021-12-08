package com.citas.citas_ms.controllers;


import com.citas.citas_ms.exceptions.PersonaNotFoundException;
import com.citas.citas_ms.models.Persona;
import com.citas.citas_ms.repositories.PersonaRepository;
import org.springframework.web.bind.annotation.*;



@RestController

public class PersonaController {

    private final PersonaRepository personaRepository;

    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping("/Personas/{document}")
    Persona getPersona(@PathVariable String document){
        return personaRepository.findById(document)
                .orElseThrow(() -> new PersonaNotFoundException("No se encontro una persona con el username: " + document));
    }

    @PostMapping("/Personas")
    Persona newPersona(@RequestBody Persona persona){
        return personaRepository.save(persona);
    }



}
