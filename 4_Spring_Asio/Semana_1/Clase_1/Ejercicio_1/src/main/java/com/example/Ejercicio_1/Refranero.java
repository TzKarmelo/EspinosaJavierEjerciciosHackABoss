package com.example.Ejercicio_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Refranero {
    // generador de refranes aleatorios
    @GetMapping
    public String refranes() {

        List<String> refranes = new ArrayList<String>();

        refranes.add("A caballo regalado no le mires el diente");
        refranes.add("A Dios rogando y con el mazo dando");
        refranes.add("A enemigo que huye, puente de plata");
        refranes.add("A la vejez, viruelas");
        refranes.add("A palabras necias, oídos sordos");
        refranes.add("A quien madruga, Dios le ayuda");
        refranes.add("A rey muerto, rey puesto");

        Random random = new Random();
        int index = random.nextInt(refranes.size());

        return refranes.get(index);
    }
}
