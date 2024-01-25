package com.example.Ejercicio_3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/morse/{frase}")
    public String convertirAMorse(@PathVariable String frase) {
        String morse = convertirMorse(frase);
        return "La frase " + frase + " en morse es " + morse;
    }

    private String convertirMorse(String frase) {
        String[] valoresMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.."};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == ' ') {
                resultado.append("   "); // 3 espacios entre palabras
            } else {
                resultado.append(valoresMorse[letra - 'a']); // se restan valores ascii para obtener el indice, a - a = 0; b - a = 1; c - a = 2; ...
            }
        }
        return resultado.toString();
    }
}
