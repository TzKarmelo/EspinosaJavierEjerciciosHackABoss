package com.empresa.ejercicio_2.exceptions;

public class EmptyProductQuantityException extends RuntimeException{
    
    private int cantidad;

    public EmptyProductQuantityException(int cantidad) {
        
        super(String.format("\nNo ha ingresado nada. Por favor ingrese una cantidad válido.", cantidad));
        
        this.cantidad = cantidad;
    } 
}
