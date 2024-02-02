package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.DTO.CalificacionesDTO;
import com.example.Ejercicio_1.Models.Calificaciones;
import com.example.Ejercicio_1.Models.Estudiante;

import java.util.*;

public class CalificacionesService implements ICalificacionesService{

    List<Estudiante> estudiantes = new ArrayList<>();
    List<Calificaciones> calificaciones = new ArrayList<>();

    @Override
    public String crearEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return "Estudiante creado" + estudiante.getNombre();
    }

    @Override
    public String crearCalificaciones(Calificaciones calificaciones) {
        this.calificaciones.add(calificaciones);
        return "Calificaciones creadas";
    }

    @Override
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    @Override
    public Calificaciones obtenerCalificaciones(Integer num_matricula) {
        return calificaciones.stream()
                .filter(p -> p.getEstudiante().getNum_matricula().equals(num_matricula))
                .findFirst()
                .get();
    }

    @Override
    public List<CalificacionesDTO> obtenerCalificaciones() {

        Collections.sort(calificaciones, Comparator.comparingDouble(Calificaciones::getPromedio).reversed());

        CalificacionesDTO calificacionesDTO = new CalificacionesDTO();

        List<CalificacionesDTO> calificacionesDTOList = new ArrayList<>();

        for (Calificaciones calificacion : calificaciones) {

            calificacionesDTO.setCalificacion1(calificacion.getCalificacion1());
            calificacionesDTO.setCalificacion2(calificacion.getCalificacion2());
            calificacionesDTO.setCalificacion3(calificacion.getCalificacion3());
            calificacionesDTO.setPromedio(calificacion.getPromedio());
            calificacionesDTO.setNombre_estudiante(calificacion.getEstudiante().getNombre());
            calificacionesDTOList.add(calificacionesDTO);

        }
        return calificacionesDTOList;
    }
}
