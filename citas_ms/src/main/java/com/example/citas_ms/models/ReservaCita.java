package com.example.citas_ms.models;


import org.springframework.data.annotation.Id;

import java.util.Date;

public class ReservaCita {
    @Id
    private String idReserva;
    private String document;
    private String especialidadCita;
    private String especialistaCita;
    private Date diaCita;

    public ReservaCita(String idReserva, String document, String especialidadCita, String especialistaCita, Date diaCita) {
        this.idReserva = idReserva;
        this.document = document;
        this.especialidadCita = especialidadCita;
        this.especialistaCita = especialistaCita;
        this.diaCita = diaCita;
    }

    public String getIdReserva() {
       return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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
}


