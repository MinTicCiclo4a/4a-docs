package com.misiontic.account_ms.models;


import org.springframework.data.annotation.Id;
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

    public String getEspecialidadCita() {
        return especialidadCita;
    }

    public String getEspecialistaCita() {
        return especialistaCita;
    }

    public Date getDiaCita() {
        return diaCita;
    }

    public String getSedeCita() {
        return sedeCita;
    }

    public String getConsultorioCita() {
        return consultorioCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public void setEspecialidadCita(String especialidadCita) {
        this.especialidadCita = especialidadCita;
    }

    public void setEspecialistaCita(String especialistaCita) {
        this.especialistaCita = especialistaCita;
    }

    public void setDiaCita(Date diaCita) {
        this.diaCita = diaCita;
    }

    public void setSedeCita(String sedeCita) {
        this.sedeCita = sedeCita;
    }

    public void setConsultorioCita(String consultorioCita) {
        this.consultorioCita = consultorioCita;
    }
}
