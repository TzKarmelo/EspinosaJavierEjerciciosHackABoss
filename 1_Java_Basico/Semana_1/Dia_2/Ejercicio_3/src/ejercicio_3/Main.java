package ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("\nCalculo temperatura media");
        
        Scanner sc = new Scanner(System.in);
        
        double[] total = new double[7];
        
        double media = 0;
        
        for (int i = 0; i < total.length; i++) {
            
            System.out.print("\nIngrese la temperatura "+ (i + 1) + ": ");
            
            double temp = sc.nextDouble();
            
            total[i] = temp;
            
        }
        
        for (int i = 0; i < total.length; i++) {
            
            media += total[i];            
            
        }        
        
        System.out.printf("\nLa temperatura media es de %.1f grados.\n\n", (media / 7));
        
    }
    
}
