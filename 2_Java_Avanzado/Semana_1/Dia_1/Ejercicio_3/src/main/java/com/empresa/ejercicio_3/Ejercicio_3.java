
package com.empresa.ejercicio_3;


public class Ejercicio_3 {

    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        
        dataManager.guardarDatos(0, "Dato 1");
        dataManager.guardarDatos(1, "Dato 2");
        dataManager.guardarDatos(2, "Dato 3");
        dataManager.guardarDatos(3, "Dato 4");
        dataManager.guardarDatos(4, "Dato 5");

        dataManager.accederDatos(2);
        dataManager.accederDatos(8); // Esto provocará una excepción
        
        dataManager.imprimirVector();
    }
}
