package com.example.Ejercicio_1.Models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private Long id;
    private Integer num_matricula;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
}
