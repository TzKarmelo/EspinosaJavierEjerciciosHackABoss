package com.example.Ejercicio_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/morse/{palabra}")
    public String convertirAMorse(@PathVariable String palabra) {
        String morse = convertirMorse(palabra);
        return "La palabra " + palabra + " en morse es " + morse;
    }

    private String convertirMorse(String palabra) {
        String[] valoresMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
        "--.."};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            resultado.append(valoresMorse[letra - 'a']); // se restan valores ascii para obtener el indice, a - a = 0; b - a = 1; c - a = 2; ...
        }
        return resultado.toString();
    }


}
