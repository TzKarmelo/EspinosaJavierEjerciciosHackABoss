package com.empresa.ejercicio_1.exceptions;

import java.time.LocalDate;

public class ReservaInvalidaException extends RuntimeException{
    
    private String nombre;
    private String destino;
    private LocalDate fecha_viaje;
    private int asientos;

    public ReservaInvalidaException(String nombre, String destino, LocalDate fecha_viaje, int asientos) {
        super(String.format("Sr. %s, el vuelo con destino %s el dia %s, no tiene %s disponibles.", nombre, destino, fecha_viaje, asientos));
        this.nombre = nombre;
        this.destino = destino;
        this.fecha_viaje = fecha_viaje;
        this.asientos = asientos;
    }

    
    
    
    
}
