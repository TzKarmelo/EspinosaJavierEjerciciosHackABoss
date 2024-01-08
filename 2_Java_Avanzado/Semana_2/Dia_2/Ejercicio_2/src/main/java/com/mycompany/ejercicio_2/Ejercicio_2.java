
package com.mycompany.ejercicio_2;

import com.mycompany.ejercicio_2.models.Mascota;
import com.mycompany.ejercicio_2.models.RegistroMascotas;
import java.util.List;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        RegistroMascotas<Integer> registro = new RegistroMascotas<>();

        registro.agregarMascota(new Mascota<>(1, "Rusti", 3, "Perro"));
        registro.agregarMascota(new Mascota<>(2, "Mixa", 5, "Gato"));
        registro.agregarMascota(new Mascota<>(3, "Milo", 2, "Reptil"));
        registro.agregarMascota(new Mascota<>(4, "Lucy", 1, "Ave"));
        registro.agregarMascota(registro.generarDatosAleatorios());

        // Buscar por nombre
        
        List<Mascota<Integer>> mascotasPorNombre = registro.buscarPorNombre("Milo");
        System.out.println("Mascotas con nombre Milo:");
        for (Mascota<Integer> mascota : mascotasPorNombre) {
            System.out.println("\nNombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie());
        }

        // Buscar por especie
        
        List<Mascota<Integer>> mascotasPorEspecie = registro.buscarPorEspecie("Ave");
        System.out.println("\nMascotas de especie Ave:");
        for (Mascota<Integer> mascota : mascotasPorEspecie) {
            System.out.println("\nNombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie());
        }

        // Cantidad total de mascotas
        
        int cantidadTotal = registro.cantidadTotalMascotas();
        System.out.println("\nCantidad total de mascotas : " + cantidadTotal);

        // Agregar 5 mascotas aleatorias
        
        for (int i = 0; i < 5; i++) {
            registro.agregarMascota(registro.generarDatosAleatorios());
        }

        // Actualizar la cantidad total
        
        cantidadTotal = registro.cantidadTotalMascotas();
        System.out.println("\nCantidad total nueva de mascotas: " + cantidadTotal);
        
    }
}
