package com.empresa.ejercicio_2.exceptions;

public class InvalidProductPriceException extends RuntimeException{
    
    private double precio;

    public InvalidProductPriceException(double precio) {
        
        super(String.format("\nEl precio del producto contiene caracteres. Ingrese un precio válido.", precio));
        
        this.precio = precio;
    }
}
