package com.misiontic.citas_ms.exceptions;

public class PacienteNotFoundException extends RuntimeException {
    public PacienteNotFoundException(String message) {
        super(message);
    }
}