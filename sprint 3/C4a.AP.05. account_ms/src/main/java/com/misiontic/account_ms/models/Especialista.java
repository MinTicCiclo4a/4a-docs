package com.misiontic.account_ms.models;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Especialista {
    @Id
    private String id;
    private String nombreEspecialista;
    private String especialidad;
    private String sede;
    private String consultorio;

    public Especialista(String id, String nombreEspecialista, String especialidad, String sede, String consultorio) {
        this.id = id;
        this.nombreEspecialista = nombreEspecialista;
        this.especialidad = especialidad;
        this.sede = sede;
        this.consultorio = consultorio;


    }

    public String getId() {
        return id;
    }

    public String getNombreEspecialista() {
        return nombreEspecialista;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getSede() {
        return sede;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombreEspecialista(String nombreEspecialista) {
        this.nombreEspecialista = nombreEspecialista;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
}
