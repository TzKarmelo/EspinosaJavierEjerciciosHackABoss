package com.example.Ejercicio_1.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CalificacionesDTO {

        private double calificacion1;
        private double calificacion2;
        private double calificacion3;
        private double promedio;
        private String nombre_estudiante;
}
