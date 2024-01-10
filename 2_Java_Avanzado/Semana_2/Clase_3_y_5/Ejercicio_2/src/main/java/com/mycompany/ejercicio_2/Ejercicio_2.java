
package com.mycompany.ejercicio_2;

import com.mycompany.ejercicio_2.models.Evento;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
    
        List<Evento> eventos = new ArrayList <>();

        eventos.add(new Evento("Reunión con Javi",LocalDate.of(2024,1,12),"Reunión"));
        eventos.add(new Evento("Conferencia conJavi",LocalDate.of(2024,1,12),"Conferencia"));
        eventos.add(new Evento("Reunión con Pedro",LocalDate.of(2024,2,10),"Reunión"));
        eventos.add(new Evento("Taller con Luis",LocalDate.of(2024,2,2),"Taller"));
        eventos.add(new Evento("Conferencia con Pedro",LocalDate.of(2024,2,10),"Conferencia"));
    
        System.out.println("Lista de eventos: \n");
        eventos.forEach(System.out::println);
        
        // Filtrar eventos para un fecha especifica (ej. 2024,2,10)
        
        LocalDate fechaEspecifica = LocalDate.of(2024,2,10);
        List<Evento> eventosFecha = eventos.stream()
                .filter(evento -> evento.getFecha().isEqual( fechaEspecifica ))
                .toList();
        
        System.out.println("\nLos eventos en la fecha " + fechaEspecifica + " son: \n");
        eventosFecha.forEach(System.out::println);
        
        // Agrupar por categoria y contar
        
        long contadorReuniones = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Reunión"))
                .count();
        
        System.out.println("\nReuniones: " + contadorReuniones);
        
        long contadorConferencias = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Conferencia"))
                .count();
        
        System.out.println("\nConferencias: " + contadorConferencias);
        
        long contadorTalleres = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Taller"))
                .count();
        
        System.out.println("\nTalleres: " + contadorTalleres);
                
        // Evento mas proximo en el tiempo
        
        LocalDate fechaActual = LocalDate.now();
        
        Optional<Evento> eventoProximo = eventos.stream()
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));
        
        eventoProximo.ifPresent(evento -> System.out.println("\nEl evento próximo es " + evento.getNombre() + " con fecha " + evento.getFecha() + "."));
        

    
    }
    
}
