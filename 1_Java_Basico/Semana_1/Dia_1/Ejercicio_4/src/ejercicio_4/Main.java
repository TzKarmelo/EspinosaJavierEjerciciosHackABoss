
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
        
        // Mostramos los resultados
        
        System.out.println("\nLa suma de " + operador1 + " y "+ operador2 + " es: " + (operador1+operador2));
        System.out.println("La resta de " + operador1 + " y " + operador2 + " es: " + (operador1-operador2));
        System.out.println("La multiplicación de " + operador1 + " y " + operador2 +" es: " +(operador1*operador2));
        
        // La división no da decimales pues són números enteros y si divides por 0 lanza una excepción By Zero...
        
        System.out.println("La división de " + operador1 + " y " + operador2 + " es: " + (operador1/operador2) + "\n");
                
    }
    
}
