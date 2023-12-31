package com.empresa.ejercicio_2.exceptions;

public class InvalidMenuEntryException extends RuntimeException{

    public InvalidMenuEntryException() {
        System.out.println("\nNo ha ingresado un número válido. Por favor, ingrese un número.");
    }
}
