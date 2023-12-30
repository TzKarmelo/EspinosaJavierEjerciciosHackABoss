
package com.empresa.ejercicio_1.models;

import java.time.LocalDate;

public class ReservaVuelos {
    
    private String nombre;
    private String destino;
    private LocalDate fecha_viaje;
    private int asientos;

    public ReservaVuelos() {
    }

    public ReservaVuelos(String nombre, String destino, LocalDate fecha_viaje, int asientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha_viaje = fecha_viaje;
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(LocalDate fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "ReservaVuelos{" + "nombre=" + nombre + ", destino=" + destino + ", fecha_viaje=" + fecha_viaje + ", asientos=" + asientos + '}';
    }
           
}
