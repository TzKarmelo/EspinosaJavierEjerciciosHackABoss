package com.mycompany.ejercicio_2.services;

import com.mycompany.ejercicio_2.models.Tarea;
import java.util.Scanner;

public class OrganizadorTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Organizador de Tareas");

        while (true) {
            System.out.print("Ingrese el nombre de la tarea principal (o 'salir' para terminar): ");
            String nombreTareaPrincipal = scanner.nextLine();

            if (nombreTareaPrincipal.equalsIgnoreCase("salir")) {
                break;
            }

            Tarea tareaPrincipal = new Tarea(nombreTareaPrincipal);
            agregarSubtareas(scanner, tareaPrincipal);

            mostrarArbolTareas(tareaPrincipal);
        }
    }

    public static void agregarSubtareas(Scanner scanner, Tarea tarea) {
        while (true) {
            System.out.print("¿Desea agregar una subtarea a \"" + tarea + "\"? (s/n): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingrese el nombre de la subtarea: ");
                String nombreSubtarea = scanner.nextLine();
                Tarea nuevaSubtarea = new Tarea(nombreSubtarea);
                tarea.agregarSubtarea(nuevaSubtarea);
                agregarSubSubtareas(scanner, nuevaSubtarea);
            } else {
                break;
            }
        }
    }

    public static void agregarSubSubtareas(Scanner scanner, Tarea tarea) {
        while (true) {
            System.out.print("¿Desea agregar una sub-subtarea a \"" + tarea + "\"? (s/n): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingrese el nombre de la sub-subtarea: ");
                String nombreSubSubtarea = scanner.nextLine();
                Tarea nuevaSubSubtarea = new Tarea(nombreSubSubtarea);
                tarea.agregarSubtarea(nuevaSubSubtarea);
                agregarSubSubtareas(scanner, nuevaSubSubtarea);
            } else {
                break;
            }
        }
    }

    public static void mostrarArbolTareas(Tarea tarea) {
        System.out.println("Estructura de Tareas:");
        tarea.mostrarTareas(0);
    }
}

