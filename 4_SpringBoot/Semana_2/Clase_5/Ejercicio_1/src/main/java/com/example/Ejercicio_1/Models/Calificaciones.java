package com.example.Ejercicio_1.Models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Calificaciones {

    private Long id;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private Estudiante estudiante;
}
