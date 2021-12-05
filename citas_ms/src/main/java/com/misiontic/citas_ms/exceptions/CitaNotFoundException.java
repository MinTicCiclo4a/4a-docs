package com.misiontic.citas_ms.exceptions;

public class CitaNotFoundException extends RuntimeException {
    public CitaNotFoundException(String message) {
        super(message);
    }
}