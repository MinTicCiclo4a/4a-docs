package com.misiontic.citas_ms.models;

import nonapi.io.github.classgraph.json.Id;

import java.util.Date;

public class Cita {

    @Id
    private String idCita;
    private String especialidadCita;
    private String especialistaCita;
    private Date diaCita;
    private String sedeCita;
    private String consultorioCita;

    public Cita(String idCita, String especialidadCita, String especialistaCita, Date diaCita, String sedeCita, String consultorioCita) {
        this.idCita = idCita;
        this.especialidadCita = especialidadCita;
        this.especialistaCita = especialistaCita;
        this.diaCita = diaCita;
        this.sedeCita = sedeCita;
        this.consultorioCita = consultorioCita;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getEspecialidadCita() {
        return especialidadCita;
    }

    public void setEspecialidadCita(String especialidadCita) {
        this.especialidadCita = especialidadCita;
    }

    public String getEspecialistaCita() {
        return especialistaCita;
    }

    public void setEspecialistaCita(String especialistaCita) {
        this.especialistaCita = especialistaCita;
    }

    public Date getDiaCita() {
        return diaCita;
    }

    public void setDiaCita(Date diaCita) {
        this.diaCita = diaCita;
    }

    public String getSedeCita() {
        return sedeCita;
    }

    public void setSedeCita(String sedeCita) {
        this.sedeCita = sedeCita;
    }

    public String getConsultorioCita() {
        return consultorioCita;
    }

    public void setConsultorioCita(String consultorioCita) {
        this.consultorioCita = consultorioCita;
    }
}
