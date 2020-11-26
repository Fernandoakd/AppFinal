package com.example.carritojenkins.exceptions;

public class NoSePuedeCrearUnCarritoVacioException extends RuntimeException{
    
    public NoSePuedeCrearUnCarritoVacioException(String mensaje){
        super(mensaje);
    }
}
