package com.example.Ejercicio_1.Conroller;

import com.example.Ejercicio_1.DTO.CalificacionesDTO;
import com.example.Ejercicio_1.Models.Calificaciones;
import com.example.Ejercicio_1.Service.CalificacionesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalificacionesController {

    CalificacionesService calificacionesService = new CalificacionesService();

    @PostMapping("/calificaciones/crear")
    @ResponseBody
    public String crearCalificaciones(@RequestBody Calificaciones calificaciones) {

        return calificacionesService.crearCalificaciones(calificaciones);
    }

    @GetMapping("/calificaciones/{num_matricula}")
    @ResponseBody
    public Calificaciones obtenerCalificaciones(@RequestBody Integer num_matricula) {

        return calificacionesService.obtenerCalificaciones(num_matricula);
    }

    @GetMapping("/calificaciones/ordendesc")
    @ResponseBody
    public List<CalificacionesDTO> obtenerCalificaciones() {

        return calificacionesService.obtenerCalificaciones();
    }

}
