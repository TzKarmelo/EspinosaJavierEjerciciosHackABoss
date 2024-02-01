package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.DTO.CalificacionesDTO;
import com.example.Ejercicio_1.Models.Calificaciones;
import com.example.Ejercicio_1.Models.Estudiante;

import java.util.List;

public interface ICalificacionesService {

    public String crearEstudiante(Estudiante estudiante);
    public String crearCalificaciones(Calificaciones calificaciones);
    public List<Estudiante> obtenerEstudiantes();
    public Calificaciones obtenerCalificaciones(Integer num_matricula);
    public List<CalificacionesDTO> obtenerCalificaciones();
}
