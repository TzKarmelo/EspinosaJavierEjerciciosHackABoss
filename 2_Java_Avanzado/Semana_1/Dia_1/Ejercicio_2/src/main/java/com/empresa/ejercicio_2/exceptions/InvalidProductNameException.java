package com.empresa.ejercicio_2.exceptions;

public class InvalidProductNameException extends RuntimeException{
    
    private String nombre;

    public InvalidProductNameException(String nombre) {
        
        super(String.format("El nombre del producto contiene dígitos o caracteres", nombre));
        
        this.nombre = nombre;
    }   
}
