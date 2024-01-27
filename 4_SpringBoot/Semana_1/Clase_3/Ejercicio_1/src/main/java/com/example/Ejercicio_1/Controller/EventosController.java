package com.example.Ejercicio_1.Controller;

import com.example.Ejercicio_1.Model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventosController {

    List<Evento> eventos = new ArrayList<>();

    @GetMapping("/eventos")
    public List<Evento> getEventos() {
        return eventos;
    }

    @GetMapping("/eventos/{id}")
    public String getEvento(@PathVariable int id) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                return evento.toString();
            }
        }
        return "No se encontró el evento";
    }

    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento evento) {
        eventos.add(evento);
        return "Evento creado" + evento.toString();
    }
}
