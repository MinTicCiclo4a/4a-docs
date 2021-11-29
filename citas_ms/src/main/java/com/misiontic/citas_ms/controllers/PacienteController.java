package com.misiontic.citas_ms.controllers;


import com.misiontic.citas_ms.exceptions.PacienteNotFoundException;
import com.misiontic.citas_ms.models.Paciente;
import com.misiontic.citas_ms.repositories.PacienteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class PacienteController {

    private final PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping("/pacientes/{identificacion}")
    Paciente getPaciente(@PathVariable String identificacion){
        return pacienteRepository.findById(identificacion)
                .orElseThrow(() -> new PacienteNotFoundException("No hay un paciente registrado con el id: " + identificacion));
    }

    @PostMapping("/pacientes")
    Paciente newPaciente(@RequestBody Paciente paciente){
        return pacienteRepository.save(paciente);
    }

}