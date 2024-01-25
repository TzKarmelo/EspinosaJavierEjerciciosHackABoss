package com.example.Ejercicio_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorControlller {

    @GetMapping("/conversor/{cm}")
    public String convertirAMetros(@PathVariable int cm) {
        double metros = convertirMetros(cm);
        return "La cantidad de " + cm + " cm en metros es " + metros + " metros.";
    }

    private double convertirMetros(int cm) {
        return cm / 100.0;
    }
}
