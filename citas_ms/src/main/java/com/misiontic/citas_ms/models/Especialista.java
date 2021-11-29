package com.misiontic.citas_ms.models;

import nonapi.io.github.classgraph.json.Id;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEspecialista() {
        return nombreEspecialista;
    }

    public void setNombreEspecialista(String nombreEspecialista) {
        this.nombreEspecialista = nombreEspecialista;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
}
