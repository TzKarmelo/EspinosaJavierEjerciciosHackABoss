package com.mycompany.ejercicio_1.services;

import com.mycompany.ejercicio_1.models.Directorio;

public class ExploradorDirectorios {
    
    public void explorarDirectorio(Directorio directorio, int nivel) {
        
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }

        System.out.println(directorio.obtenerNombre() + "/");

        for (String archivo : directorio.obtenerArchivos()) {
            for (int i = 0; i <= nivel; i++) {
                System.out.print("\t");
            }
            System.out.println(archivo);
        }

        for (Directorio subdirectorio : directorio.obtenerSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }
    }
}


