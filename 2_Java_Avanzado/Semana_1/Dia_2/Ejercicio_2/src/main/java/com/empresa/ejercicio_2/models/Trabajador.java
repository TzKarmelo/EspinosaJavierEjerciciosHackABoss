package com.empresa.ejercicio_2.models;

import com.empresa.ejercicio_2.services.CadenaProduccion;

public class Trabajador extends Thread {
    private final String nombre;
    private final CadenaProduccion cadenaProduccion;

    public Trabajador(String nombre, CadenaProduccion cadenaProduccion) {
        this.nombre = nombre;
        this.cadenaProduccion = cadenaProduccion;
    }

    @Override
    public void run() {
        while (true) {
            try {
                cadenaProduccion.realizarTarea(nombre);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}


