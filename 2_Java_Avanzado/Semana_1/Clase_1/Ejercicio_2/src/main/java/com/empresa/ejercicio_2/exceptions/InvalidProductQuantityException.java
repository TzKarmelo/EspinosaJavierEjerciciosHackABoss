package com.empresa.ejercicio_2.exceptions;

public class InvalidProductQuantityException extends RuntimeException{
    
    private int cantidad;

    public InvalidProductQuantityException(int cantidad) {
        
        super(String.format("\nEl precio del producto contiene caracteres. Ingrese un precio válido.", cantidad));
        
        this.cantidad = cantidad;
    }
}
