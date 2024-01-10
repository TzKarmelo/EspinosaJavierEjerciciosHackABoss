
package com.mycompany.ejercicio_1;

import com.mycompany.ejercicio_1.models.Auto;
import com.mycompany.ejercicio_1.models.InventarioAutos;
import java.util.List;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Seat", "Toledo", 2015, 15000.0);
        Auto auto2 = new Auto("Renault", "Grand Scenic", 2008, 30000.0);
        Auto auto3 = new Auto("Ford", "Kuga", 2023, 40000);
        Auto auto4 = new Auto("Seat", "Arona", 2022, 35000.0);
        
        InventarioAutos<Auto> inventario = new InventarioAutos<>();
        
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);
        inventario.agregarAuto(auto4);
        
        // Buscar por marca
        
        String marcaBuscada = "Seat";
        
        List<Auto> autosPorMarca = inventario.buscarPorMarca(marcaBuscada);
        System.out.println("Autos de la marca " + marcaBuscada + ":\n");
        for (Auto auto : autosPorMarca) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " - Año: " + auto.getAño() + " - Precio: " + auto.getPrecio());
        }
        
        // Buscar por año
        
        int añoBuscado = 2023;
        
        List<Auto> autosPorAño = inventario.buscarPorAño(añoBuscado);
        System.out.println("\nAutos del año " + añoBuscado + ":\n");
        for (Auto auto : autosPorAño) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " - Año: " + auto.getAño() + " - Precio: " + auto.getPrecio());
        }
        
        // Calcular el valor total inventario
        
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nValor total del inventario: " + valorTotal);
        
    }
}
