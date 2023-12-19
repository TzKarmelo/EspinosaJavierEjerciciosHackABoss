package ejercicio_1;

import es.Electrodomestico.Electrodomestico;

public class Main {

    public static void main(String[] args) {
        
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "LG", "HDTV22", 1500, "negro");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Samsung", "DrySoft", 2000, "blanco");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Hisense", "TV28FHD", 2500, "negro");
        
        Electrodomestico electrodomestico4 = new Electrodomestico();
        
        System.out.println("\nElectrodomestico 1: ");
        System.out.println("Marca => " + electrodomestico1.getMarca() + " // Modelo => " + electrodomestico1.getModelo() + " // Consumo => " + electrodomestico1.getConsumo());
        
        System.out.println("\nElectrodomestico 2: ");
        System.out.println("Marca => " + electrodomestico2.getMarca() + " // Modelo => " + electrodomestico2.getModelo() + " // Consumo => " + electrodomestico2.getConsumo());
        
        System.out.println("\nElectrodomestico 3: ");
        System.out.println("Marca => " + electrodomestico3.getMarca() + " // Modelo => " + electrodomestico3.getModelo() + " // Consumo => " + electrodomestico3.getConsumo());
        
        // Al intentar obtener la marca de un objeto sin parametros devuelve null...
        
        System.out.println("\nElectrodomestico 4: ");
        System.out.println("Marca => " + electrodomestico4.getMarca() + "\n");
        
    }
    
}
