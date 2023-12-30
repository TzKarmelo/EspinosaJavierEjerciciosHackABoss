package com.empresa.ejercicio_1.services;

import com.empresa.ejercicio_1.exceptions.ReservaInvalidaException;
import com.empresa.ejercicio_1.models.ReservaVuelos;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservaService {

    public ReservaVuelos creaReserva() throws ReservaInvalidaException, InputMismatchException {

        ReservaVuelos reserva = new ReservaVuelos();
        Scanner sc = new Scanner(System.in);

        // Nombre //////////////////////////////
        
        boolean validacionNombre = false;
        
        do {
            System.out.println("\nIngrese su nombre completo: ");
            String nombre = sc.next();

            if (nombre.trim().isEmpty()) {
                System.out.println("\nNo ha ingresado nada. Por favor, ingrese un nombre válido.");
            } else {
                if (!nombre.matches(".*\\d.*") && nombre.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")) {
                    validacionNombre = true;
                } else {
                    System.out.println("\nEl nombre contiene dígitos o carácteres especiales. Ingrese un nombre válido.");
                }
            }

            reserva.setNombre(nombre);

        } while (!validacionNombre);

        // Destino //////////////////////////////// 
        
        boolean validacionDestino = false;

        do {
            System.out.println("\nIngrese el destino: ");
            String destino = sc.nextLine();

            if (destino.trim().isEmpty()) {
                System.out.println("\nNo ha ingresado nada. Por favor, ingrese un destino válido.");
            } else {
                if (!destino.matches(".*\\d.*") && destino.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")) {
                    validacionDestino = true;
                } else {
                    System.out.println("\nEl destino contiene dígitos o carácteres especiales. Ingrese un destino válido.");
                }
            }

            reserva.setDestino(destino);

        } while (!validacionDestino);

        // Fecha Reserva //////////////////////////////////
        
        boolean validacionFecha = false;
        LocalDate fechaReserva = null;

        do {
            System.out.println("\nIngrese la fecha de la reserva ->");
            System.out.print("\n\t\tDia: ");
            int dia = sc.nextInt();
            System.out.print("\t\tMes: ");
            int mes = sc.nextInt();
            System.out.print("\t\tAño: ");
            int anio = sc.nextInt();

            if (anio > 0 && mes >= 1 && mes <= 12) {
                int maxDiasEnMes = YearMonth.of(anio, mes).lengthOfMonth();
                if (dia >= 1 && dia <= maxDiasEnMes) {
                    fechaReserva = LocalDate.of(anio, mes, dia);
                    validacionFecha = true;
                } else {
                    System.out.println("\nEl día ingresado no es válido para el mes y año proporcionados. Ingrese una fecha válida.");
                }
            } else {
                System.out.println("\nLa fecha ingresada no es válida. Ingrese una fecha válida.");
            }

            reserva.setFecha_viaje(fechaReserva);

        } while (!validacionFecha);

        // Asientos ////////////////////////////////////////////
        
        boolean validacionAsientos = false;        
        int asientos = 0;
        
        do {
            System.out.print("\n\tIngrese el número de asientos: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("\nNo ha ingresado nada. Por favor, ingrese un número válido.");
            } else {
                if (input.matches("[0-9]+")) {
                    asientos = Integer.parseInt(input);
                    validacionAsientos = true;
                } else {
                    System.out.println("\nEl número de asientos contiene carácteres no válidos. Ingrese un número válido.");
                }
            }

            reserva.setAsientos(asientos);

        } while (!validacionAsientos);
        
        // Excepción suponiendo que quedan 3 asientos.. /////////////
        
        int asientosDisponibles = 3;
        
        if(reserva.getAsientos() > asientosDisponibles) {
            throw new ReservaInvalidaException(reserva.getNombre(), reserva.getDestino(), reserva.getFecha_viaje(), reserva.getAsientos());
        }

        return reserva;
    }

}