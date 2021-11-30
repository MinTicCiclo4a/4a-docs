package com.misiontic.account_ms.controllers;

import com.misiontic.account_ms.exceptions.EspecialistaNotFoundException;
import com.misiontic.account_ms.models.Especialista;
import com.misiontic.account_ms.repositories.EspecialistaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class EspecialistaController {

    private final EspecialistaRepository especialistaRepository;

    public EspecialistaController(EspecialistaRepository especialistaRepository) {
        this.especialistaRepository = especialistaRepository;
    }

    @GetMapping("/especialistas/{idEspecialista}")
    Especialista getEspecialista(@PathVariable String idEspecialista){
        return especialistaRepository.findById(idEspecialista)
                .orElseThrow(() -> new EspecialistaNotFoundException("No se encontro al especialista con el id: " + idEspecialista));
    }

    @PostMapping("/especialistas")
    Especialista newEspecialista(@RequestBody Especialista especialista){
        return especialistaRepository.save(especialista);
    }
}