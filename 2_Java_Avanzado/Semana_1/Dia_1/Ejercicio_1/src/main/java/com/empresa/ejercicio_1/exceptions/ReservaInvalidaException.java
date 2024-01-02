package com.empresa.ejercicio_1.exceptions;

import java.time.LocalDate;

public class ReservaInvalidaException extends RuntimeException{
    
   
    public ReservaInvalidaException(String nombre, String destino, LocalDate fecha_viaje, int asientos) {
        super(String.format("\n\nSr. %s, el vuelo con destino %s el dia %s, no tiene %s asientos disponibles.\n", nombre, destino, fecha_viaje, asientos));
        
    }
}
