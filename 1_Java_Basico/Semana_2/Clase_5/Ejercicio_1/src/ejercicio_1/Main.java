
package ejercicio_1;

import ejercicio_1.modelos.Animal;
import ejercicio_1.modelos.Ave;
import ejercicio_1.modelos.Mamifero;
import ejercicio_1.modelos.Reptil;

public class Main {

    public static void main(String[] args) {
        
        Mamifero mamifero = new Mamifero(4, "sexual", "negro", "selva", 1, "gorila", 10, "pelo", "hojas y fruta");
        Ave ave = new Ave(21.5, "remonte", "marrón", "garfio", 2, "buitre", 6, "pluma", "carroña");
        Reptil reptil = new Reptil(25.5, "granular", "no tiene", "desertico", 3, "Gekko", 2, "blanda", "insectos y larvas");
        
        mamifero.Saludar();
        ave.Saludar();
        reptil.Saludar();
        
        // Se puede asignar a la clase animal un objeto tipo mamifero gracias a la herencia. Esto es el Polimorfismo.
        
        Animal animal = new Mamifero(4, "sexual", "marron", "jungla", 4, "mono", 8, "pelo", "fruta y hojas");
        
        System.out.println("");
        
        animal.Saludar();
        
        // De igual manera si cambiamos el modificador de acceso a Private en los metodos no se podrá acceder desde main ni desde otra clase que no sea la propia donde esta definida.
        
    }
    
}
