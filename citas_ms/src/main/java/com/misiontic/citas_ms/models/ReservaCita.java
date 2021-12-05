package com.misiontic.citas_ms.models;

import nonapi.io.github.classgraph.json.Id;

import java.util.Date;

public class ReservaCita {

    @Id
    private String idReserva;
    private long idPaciente;
    private String especialidadCita;
    private String especialistaCita;
    private Date diaCita;

    public ReservaCita(String idReserva, long idPaciente, String especialidadCita, String especialistaCita, Date diaCita) {
        this.idReserva = idReserva;
        this.idPaciente = idPaciente;
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

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
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
