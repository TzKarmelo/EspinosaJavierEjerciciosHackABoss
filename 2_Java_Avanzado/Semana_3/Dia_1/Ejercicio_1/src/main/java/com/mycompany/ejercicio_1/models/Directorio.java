
package com.mycompany.ejercicio_1.models;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public List<Directorio> obtenerSubdirectorios() {
        return this.subdirectorios;
    }

    public List<String> obtenerArchivos() {
        return this.archivos;
    }
}
