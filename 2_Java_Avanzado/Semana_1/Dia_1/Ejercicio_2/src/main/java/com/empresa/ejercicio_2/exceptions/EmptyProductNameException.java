package com.empresa.ejercicio_2.exceptions;

public class EmptyProductNameException extends RuntimeException{
    
    private String nombre;

    public EmptyProductNameException(String nombre) {
        
        super(String.format("\nNo ha ingresado nada. Por favor, ingrese un nombre válido", nombre));
        
        this.nombre = nombre;
    }    
}
