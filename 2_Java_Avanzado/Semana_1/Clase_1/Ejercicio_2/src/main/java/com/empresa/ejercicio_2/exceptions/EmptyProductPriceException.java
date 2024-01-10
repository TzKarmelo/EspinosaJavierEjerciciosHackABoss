package com.empresa.ejercicio_2.exceptions;

public class EmptyProductPriceException extends RuntimeException{
    
    private double precio;

    public EmptyProductPriceException(double precio) {
        
        super(String.format("\nNo ha ingresado nada. Por favor ingrese un precio válido.", precio));
        
        this.precio = precio;
    }
}
