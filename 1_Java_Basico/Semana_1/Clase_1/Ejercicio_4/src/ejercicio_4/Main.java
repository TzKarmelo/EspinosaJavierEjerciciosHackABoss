
package ejercicio_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedimos dos enteros como dice el ejercicio...
        
        System.out.println("Operaciones");
        System.out.print("\nDime un operador: ");
        
        int operador1 = sc.nextInt();
        
        System.out.print("Dime el segundo operador: ");
        
        int operador2 = sc.nextInt();
        
        int suma = operador1 + operador2;
        int resta = operador1 - operador2;
        int multiplicacion = operador1 * operador2;
        double division = operador1 / operador2;
        
        // Mostramos los resultados
        
        System.out.println("\nLa suma de " + operador1 + " y "+ operador2 + " es: " + suma);
        System.out.println("La resta de " + operador1 + " y " + operador2 + " es: " + resta);
        System.out.println("La multiplicación de " + operador1 + " y " + operador2 +" es: " + multiplicacion);
        
        // Si divides por 0 lanza una excepción By Zero...
        
        System.out.println("La división de " + operador1 + " y " + operador2 + " es: " + division + "\n");
                
    }
    
}
