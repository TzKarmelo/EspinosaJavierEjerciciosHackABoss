package com.example.Ejercicio_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneradorDatos {

    @GetMapping
    public String DatosCuriosos() {

        List<String> datos = List.of(
                "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo",
                "Los delfines son capaces de reconocerse a sí mismos en un espejo",
                "Las ballenas jorobadas son capaces de imitar la voz humana",
                "Las hormigas pueden transportar objetos que pesan hasta 50 veces su propio peso",
                "Las flores de girasol siguen la trayectoria del sol");

        int random = (int) (Math.random() * datos.size());

        return datos.get(random);
    }
}