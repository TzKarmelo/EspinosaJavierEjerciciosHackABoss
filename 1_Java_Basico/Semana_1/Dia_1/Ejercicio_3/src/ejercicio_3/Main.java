
package ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        double base, altura;
		
            Scanner sc = new Scanner(System.in);

            System.out.println("Ejercicio calcular area triangulo");

            System.out.print("\nDime la base del triangulo: ");

            base = sc.nextDouble();

            System.out.print("Dime la altura del triangulo: ");

            altura = sc.nextDouble();

            System.out.println("\nEl área del triangulo es " + (base*altura)/2 + "\n");
        
    }
    
}
