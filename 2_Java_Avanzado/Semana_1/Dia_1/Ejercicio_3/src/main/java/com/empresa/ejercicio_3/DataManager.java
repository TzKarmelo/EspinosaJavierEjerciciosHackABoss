package com.empresa.ejercicio_3;

import java.util.Arrays;

public class DataManager {

    private final int TAMANIO_VECTOR = 5; 
    private String[] vectorDatos = new String[TAMANIO_VECTOR];

    public void guardarDatos(int indice, String datos) {
        try {
            if (indice >= 0 && indice < TAMANIO_VECTOR) {
                vectorDatos[indice] = datos;
                System.out.println("Datos almacenados correctamente en la posición " + indice);
            } else {
                throw new ArrayIndexOutOfBoundsException("Índice fuera del rango del vector");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error al almacenar datos: " + e.getMessage());
        }
    }

    public void accederDatos(int indice) {
        try {
            if (indice >= 0 && indice < TAMANIO_VECTOR) {
                String valor = vectorDatos[indice];
                System.out.println("Datos en la posición " + indice + ": " + valor);
            } else {
                throw new ArrayIndexOutOfBoundsException("Índice fuera del rango del vector");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error al acceder a datos: " + e.getMessage());
        }
    }

    public void imprimirVector() {
        System.out.println("Contenido del vector: " + Arrays.toString(vectorDatos));
    }
}
