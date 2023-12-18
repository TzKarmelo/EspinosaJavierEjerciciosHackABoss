
package ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Crear el mapa de asientos inicial
        
        char[][] asientos = {
            {'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {

            // Mostrar el mapa de asientos del teatro
            
            System.out.println("Mapa de Asientos:\n");
            
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir al usuario la acción deseada...
            
            System.out.println("\nQué desea hacer?");
            System.out.println("\n1. Reservar asiento");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                
                // Pedir al usuario la fila y número de asiento...
                
                System.out.print("\nIngrese la fila (1-5) o 0 para salir: ");
                
                int fila = scanner.nextInt();
                
                // Si es 0 salir...

                if (fila == 0) {
                    System.out.println("\nGracias y hasta la próxima...\n");
                    break;
                }

                System.out.print("Ingrese el número de asiento (1-5): ");
                
                int numeroAsiento = scanner.nextInt();

                // Comprueba si el asiento está disponible y marcarlo
                
                if (fila >= 1 && fila <= 5 && numeroAsiento >= 1 && numeroAsiento <= 5) {
                    
                    // Se resta 1 para hacer coincidir con la posicion del array...
                    
                    if (asientos[fila-1][numeroAsiento-1] == 'O') {
                        
                        asientos[fila-1][numeroAsiento-1] = 'X';
                        
                        System.out.println("\nReserva exitosa en la Fila " + fila + ", Asiento " + numeroAsiento + "!");
                        
                    } else {
                        
                        // Si esta ocupado....
                        
                        System.out.println("\nEl asiento seleccionado está ocupado. Por favor, elija otro asiento...\n");
                        
                    }
                } else {
                    
                    // Si no existe...
                    
                    System.out.println("\nIngrese una fila y número de asiento válidos (entre 1 y 5)...\n");
                    
                }
            } else if (opcion == 2) {
                
                // Si elije la opcion 2 salimos con un break...
                
                System.out.println("\nGracias y hasta la próxima...\n");
                break;
                
            } else {
                
                // Si no es 1 o 2 ...
                
                System.out.println("Por favor, seleccione una opción válida (1 o 2).");
            }
                        
        }

    }
       
}
