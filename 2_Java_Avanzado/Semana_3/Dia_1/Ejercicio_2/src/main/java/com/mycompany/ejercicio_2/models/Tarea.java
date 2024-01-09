package com.mycompany.ejercicio_2.models;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Tarea nombre= " + nombre + ", subtareas= " + subtareas;
    }
    
    

    public void agregarSubtarea(Tarea tarea) {
        subtareas.add(tarea);
    }

    public void mostrarTareas(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println(nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarTareas(nivel + 1);
        }
    }
    
    
}

