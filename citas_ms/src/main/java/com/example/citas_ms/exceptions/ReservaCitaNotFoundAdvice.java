package com.example.citas_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class ReservaCitaNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(com.example.citas_ms.exceptions.ReservaCitaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(com.example.citas_ms.exceptions.ReservaCitaNotFoundException ex){
        return ex.getMessage();
    }
}