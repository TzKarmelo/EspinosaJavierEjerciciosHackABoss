package ejercicio_1;

import ejercicio_1.modelos.Auto;
import ejercicio_1.modelos.Camioneta;
import ejercicio_1.modelos.Combustion;
import ejercicio_1.modelos.Electrico;
import ejercicio_1.modelos.Moto;
import ejercicio_1.modelos.Vehiculo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto(10000, 8, 1, "2843KWF", "Tesla", "Modelo S", 2021, 60000);
        Auto auto2 = new Auto(12000, 9, 4, "4356LMF", "Mercedes", "SQL", 2022, 100000);
        Camioneta camioneta1 = new Camioneta(50, 10, 3, "4598FWZ", "Renault", "Scenic", 2008, 35000);
        Camioneta camioneta2 = new Camioneta(60, 12, 5, "5980HKL", "Mercedes", "Vito", 2018, 55000);
        Moto moto1 = new Moto(900, "4 tiempos", 2, "4356JFR", "Honda", "CBR", 2018, 12000);
        Moto moto2 = new Moto(1000, "4 tiempos", 6, "6978KRM", "Yamaha", "YZF", 2019, 15000);
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        vehiculos.add(auto1);
        vehiculos.add(auto2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        
        for (Vehiculo vehiculo : vehiculos) {
            
            System.out.println("\nTipo de vehiculo: " + vehiculo.getClass().getSimpleName());
            System.out.println("ID: " + vehiculo.getId());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnio());
            System.out.println("Costo: " + vehiculo.getCosto());
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años\n");
            
            if (vehiculo instanceof Electrico electrico) {
                electrico.cargarEnergia();
            } else if (vehiculo instanceof Combustion combustion) {
                combustion.recargarCombustible();
            }
            
            System.out.println("\n********************************");
            
        }

    }
    
}
