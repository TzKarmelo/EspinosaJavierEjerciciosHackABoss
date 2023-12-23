
package com.mycompany.ejercicio_2;

import com.mycompany.ejercicio_2.models.Platillos;
import com.mycompany.ejercicio_2.persistence.ControladoraPersistencia;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        ControladoraPersistencia controladora = new ControladoraPersistencia();
        
        // Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        
        Platillos platillo1 = new Platillos("Tortilla de patatas", "Corta patatas y cebolla en rodajas, fríelas hasta dorar, mézclalas con huevos batidos, cocina la mezcla en sartén y volteando para dorar por ambos lados.", 8.75);
        
        controladora.crearPlatillo(platillo1);
        
        // Crear 2 objetos de tipo platillo más.
        
         Platillos platillo2 = new Platillos("Macarrones", "Cuece macarrones en agua con sal hasta que estén al dente. Mezcla con salsa de tomate, queso rallado y hierbas al gusto.", 9.50);
        
        controladora.crearPlatillo(platillo2);
        
         Platillos platillo3 = new Platillos("Ensaladilla rusa", "Cocina papas y zanahorias, luego mezcla con mayonesa, guisantes, atún y huevos cocidos.", 7.95);
        
        controladora.crearPlatillo(platillo3);
        
        // Eliminar luego uno y editar los datos de otro mediante JPA.
        
        controladora.borrarPlatillo(3);
        
        platillo2.setPrecio(11.50);
        controladora.modificarPlatillo(platillo2);
        
        // Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.

        List<Platillos> listaPlatillos = controladora.traerPlatillos();
        
        System.out.println("\nLista de platillos: ");
        
        for (Platillos listaPlatillo : listaPlatillos) {
            System.out.println("\n" + listaPlatillo.toString() + "\n");
        }
        
    }
}
