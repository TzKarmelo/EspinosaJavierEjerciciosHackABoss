
package ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nAcceso recital");
        System.out.print("\nIngresa tu edad: ");
        
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            
            System.out.println("\nAcceso permitido. Eres mayor de edad...");
            
        } else {
            
            System.out.println("\nAcceso denegado. NO eres mayor de edad...");
            
        }
    }
    
}
