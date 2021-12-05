package com.misiontic.citas_ms.exceptions;

public class ReservaCitaNotFoundException extends RuntimeException {
    public ReservaCitaNotFoundException(String message) {
        super(message);
    }
}