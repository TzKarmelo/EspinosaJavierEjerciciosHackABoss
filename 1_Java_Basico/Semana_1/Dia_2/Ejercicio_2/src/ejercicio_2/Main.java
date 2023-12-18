
package ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Creamos e iniciamos a 0 un contador o acumulador para el total de la compra...
        
        double total = 0;
        
        System.out.println("\nCajero Supermercado");
        
        while (true) {
            
            System.out.print("\nIngresa precio del producto ( 0 para salir ): ");
            
            double precio = sc.nextDouble();
            
            // Si no es 0 suma el precio al total...
            
            if (precio != 0) {
                
                total += precio;
                
            } else if (precio==0) {
                
                // Si es 0 muestra el total de la compra y sale del bucle con break...
                
                System.out.println("\nEl total de la compra es: " + total + " €\n");
                
                break;
            }
            
        }
        
    }
    
}
