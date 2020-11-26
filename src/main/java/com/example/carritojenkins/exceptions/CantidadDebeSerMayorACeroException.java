package com.example.carritojenkins.exceptions;

public class CantidadDebeSerMayorACeroException extends RuntimeException{
    
    public CantidadDebeSerMayorACeroException(String mensaje){
        super(mensaje);
    }
    
}
