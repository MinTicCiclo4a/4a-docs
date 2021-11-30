package com.misiontic.account_ms.models;


import org.springframework.data.annotation.Id;

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

    public long getIdPaciente() {
        return idPaciente;
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

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
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
}


