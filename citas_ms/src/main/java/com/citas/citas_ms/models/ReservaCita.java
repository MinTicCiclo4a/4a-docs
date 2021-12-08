package com.citas.citas_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ReservaCita {

    @Id
    private String id;
    private String documentPersona;
    private String especialidadCita;
    private String especialistaCita;
    private Date diaCita;

    public ReservaCita(String id, String documentPersona, String especialidadCita, String especialistaCita, Date diaCita) {
        this.id = id;
        this.documentPersona = documentPersona;
        this.especialidadCita = especialidadCita;
        this.especialistaCita = especialistaCita;
        this.diaCita = diaCita;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentPersona() {
        return documentPersona;
    }

    public void setDocumentPersona(String documentPersona) {
        this.documentPersona = documentPersona;
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
