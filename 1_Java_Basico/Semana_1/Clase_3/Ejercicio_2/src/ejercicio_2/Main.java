package ejercicio_2;

import es.Persona.Persona;

public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona(1, "Jose", 31, "Balmes, 11", 123456789);
        Persona persona2 = new Persona(2, "Juan", 29, "Diputación, 213", 987654321);
        Persona persona3 = new Persona(3, "Maria", 45, "Corcega, 23", 456789123);
        Persona persona4 = new Persona(4, "Luisa", 58, "Aribau, 71", 654321987);
        Persona persona5 = new Persona(5, "Manuel", 19, "Diagonal, 96", 788965423);
        
        Persona[] personas = {persona1,persona2,persona3,persona4,persona5};
        
        for (int i = 0; i < personas.length; i++) {
            
            System.out.println("Nombre: " + personas[i].getNombre() + " // Edad: " + personas[i].getEdad());
            
        }
        
        System.out.println("\nCambio de nombres...");
        
        System.out.println("\nNombre persona1: " + persona1.getNombre());
        persona1.setNombre("Pedro");
        System.out.println("Nuevo nombre persona1: " + persona1.getNombre());
        
        System.out.println("\nNombre persona2: " + persona2.getNombre());
        persona1.setNombre("Javier");
        System.out.println("Nuevo nombre persona2: " + persona2.getNombre());
        
        System.out.println("\nMostrar mayores de 30 años...\n");
        
        for (int i = 0; i < personas.length; i++) {
            
            if (personas[i].getEdad() > 30) {
                
                System.out.println(personas[i]);
                
            }
            
        }
        System.out.println("");
        
        
        
    }
    
}
