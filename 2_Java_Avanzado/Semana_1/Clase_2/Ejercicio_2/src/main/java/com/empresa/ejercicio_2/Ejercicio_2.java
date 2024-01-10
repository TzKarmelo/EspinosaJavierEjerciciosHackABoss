package com.empresa.ejercicio_2;

import com.empresa.ejercicio_2.models.Trabajador;
import com.empresa.ejercicio_2.services.CadenaProduccion;

public class Ejercicio_2 {

    public static void main(String[] args) {
        CadenaProduccion cadenaProduccion = new CadenaProduccion();

        // Trabajadores
        Trabajador trabajador1 = new Trabajador("Trabajador 1", cadenaProduccion);
        Trabajador trabajador2 = new Trabajador("Trabajador 2", cadenaProduccion);
        Trabajador trabajador3 = new Trabajador("Trabajador 3", cadenaProduccion);

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        // Simulación de ejecución
        try {
            Thread.sleep(10000); // Simulación de tiempo de ejecución
            trabajador1.interrupt();
            trabajador2.interrupt();
            trabajador3.interrupt();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
