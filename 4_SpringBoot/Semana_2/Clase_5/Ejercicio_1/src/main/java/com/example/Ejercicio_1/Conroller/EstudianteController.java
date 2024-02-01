package com.example.Ejercicio_1.Conroller;

import com.example.Ejercicio_1.Models.Estudiante;
import com.example.Ejercicio_1.Service.CalificacionesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {

    CalificacionesService calificacionesService = new CalificacionesService();

    @PostMapping("/estudiantes/crear")
    @ResponseBody
    public String crearEstudiante(@RequestBody Estudiante estudiante) {

        return calificacionesService.crearEstudiante(estudiante);
    }

    @GetMapping("/estudiantes")
    @ResponseBody
    public List<Estudiante> obtenerEstudiantes() {

        return calificacionesService.obtenerEstudiantes();
    }
}
