package com.misiontic.citas_ms.controllers;

import com.misiontic.citas_ms.models.CitasDAO;
import com.misiontic.citas_ms.repositories.CitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})

@RequestMapping("/api/citas")

public class CitasControllers {
    @Autowired
    private CitasRepo repository;

    @PostMapping("/cita")
    public CitasDAO createCita(@Validated @RequestBody CitasDAO c){
        return repository.insert(c);
    }

    @GetMapping("/cita")
    public List<CitasDAO> getAllCitas(@Validated @RequestBody CitasDAO c){
        return repository.findAll();
    }
    @PutMapping("/cita/{Document}")
    public CitasDAO updateCita(@PathVariable Integer Document, @Validated @RequestBody CitasDAO c){
        c.setDocument(Document);
        return repository.save(c);
    }
    @DeleteMapping("/cita/{Document}")
    public void deleteCita(@PathVariable Integer Document){
        repository.deleteById(Document);
    }
}
