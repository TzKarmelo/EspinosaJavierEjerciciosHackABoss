package ejercicio_2;

import ejercicio_2.modelos.Camiseta;
import ejercicio_2.modelos.Pantalon;
import ejercicio_2.modelos.Sombrero;
import ejercicio_2.modelos.Vestimenta;
import ejercicio_2.modelos.Zapato;

public class Main {

    public static void main(String[] args) {
        
        Zapato zapato1 = new Zapato("piel", "cordones", 1, "mocasín", 89.95, "Pikolinos", 41, "negro");
        Zapato zapato2 = new Zapato("polipiel", "cordones", 2, "náutico", 45.95, "Sabater", 38, "marron");
        Zapato zapato3 = new Zapato("tela", "cordones", 3, "deportivas", 29.45, "Retal", 40, "blanco");
        
        Pantalon pantalon1 = new Pantalon("fiesta", "algodón", 4, "pinza", 19.50, "Basics", 48, "verde");
        Pantalon pantalon2 = new Pantalon("trabajo", "sintetico", 5, "bolsillos", 29.50, "Worker", 40, "azul marino");
        Pantalon pantalon3 = new Pantalon("cocina", "tela", 6, "lisos", 39.75, "Kitchen", 38, "blancos");
        
        Camiseta camiseta1 = new Camiseta("corta", "redondo", 7, "deportiva", 19.80, "Nike", 50, "blanco");
        Camiseta camiseta2 = new Camiseta("larga", "pico", 8, "interior", 10.00, "Adidas", 54, "negro");
        
        Sombrero sombrero1 = new Sombrero("gala", "XL", 9, "copa", 24.65, "HatModels", 57, "negro");
        
        Vestimenta[] vectorVes = {zapato1, zapato2, zapato3, pantalon1, pantalon2, pantalon3, camiseta1, camiseta2, sombrero1};
        
        for (int i = 0; i < vectorVes.length; i++) {
            
            vectorVes[i].mostrarMensaje();
            
        }

    }
    
}
