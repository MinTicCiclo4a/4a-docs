package com.example.citas_ms.exceptions;

public class ReservaCitaNotFoundException extends RuntimeException {
    public ReservaCitaNotFoundException(String message) {
        super(message);
    }
}