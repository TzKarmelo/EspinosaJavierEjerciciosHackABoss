
package com.mycompany.ejercicio_1;

import com.mycompany.ejercicio_1.models.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList <>();
        
        empleados.add(new Empleado("Javi", 20000, "Desarrollador"));
        empleados.add(new Empleado("Nico", 30000, "Analista"));
        empleados.add(new Empleado("Clara", 25000, "Desarrollador"));
        empleados.add(new Empleado("Elisa", 27000, "Desarrollador"));
        empleados.add(new Empleado("Jordi", 29000, "Desarrollador"));
        empleados.add(new Empleado("Luisina", 40000, "Analista"));
        
        System.out.println("Lista empleados: \n");
        empleados.forEach(System.out::println);
        
        // Filtrar empleados cuyo salario sea mayor a 25000 por ejemplo...
        
        List<String> mayorSalario = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 25000)
                .map(empleado -> empleado.getNombre() + " " + empleado.getSalario())
                .collect(Collectors.toList());
        
        System.out.println("\nEstos son los empleados con un sueldo mayor a 25000: \n");
        mayorSalario.forEach(System.out :: println);
        
        // Agrupar por categoria y calcular salario promedio por categoria
        
        List<Empleado> desarrolladores = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals("Desarrollador"))
                .collect(Collectors.toList());
        
        Double salarioPromedioDesarrollador = desarrolladores.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);
        
        System.out.println("\nEste es el grupo de desarrolladores: \n");
        desarrolladores.forEach(System.out::println);
        System.out.println("\nY el salario promedio es: " + salarioPromedioDesarrollador);
        
        List<Empleado> analistas = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals("Analista"))
                .collect(Collectors.toList());
        
        Double salarioPromedioAnalista = analistas.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);
        
        System.out.println("\nEste es el grupo de analistas: \n");
        analistas.forEach(System.out::println);
        System.out.println("\nY el salario promedio es: " + salarioPromedioAnalista);
        
        // Empleado con salario mas alto usando Optionals
        
        Optional<Empleado> nombreEmpleado = empleados.stream()
                .max((e1,e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        
        nombreEmpleado.ifPresent(empleado -> System.out.print("\nEl empleado con el salario más alto es " + empleado.getNombre() + ", con un salario de " + empleado.getSalario()));
        
        
    }
}
