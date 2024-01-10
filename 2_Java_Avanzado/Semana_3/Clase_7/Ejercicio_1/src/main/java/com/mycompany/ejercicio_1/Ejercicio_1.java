
package com.mycompany.ejercicio_1;

import com.mycompany.ejercicio_1.models.Directorio;
import com.mycompany.ejercicio_1.services.ExploradorDirectorios;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Directorio raiz = new Directorio("Raiz");
        Directorio documentos = new Directorio("Documentos");
        Directorio imagenes = new Directorio("Imágenes");
        Directorio textos = new Directorio("Textos");

        raiz.agregarSubdirectorio(documentos);
        raiz.agregarSubdirectorio(imagenes);
        documentos.agregarSubdirectorio(textos);

        documentos.agregarArchivo("archivo.exe");
        textos.agregarArchivo("texto.txt");
        imagenes.agregarArchivo("imagen.jpg");
        documentos.agregarArchivo("juego.exe");
        imagenes.agregarArchivo("imagen2.jpg");
        textos.agregarArchivo("curriculum.pdf");

        ExploradorDirectorios explorador = new ExploradorDirectorios();
        
        explorador.explorarDirectorio(raiz, 0);
    }
}
