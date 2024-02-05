package com.example.Ejercicio_1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Vehicles {

    private Long id;
    private String brand;
    private String model;
    private String kilometers;
    private Integer doors;
    private Double price;
}
