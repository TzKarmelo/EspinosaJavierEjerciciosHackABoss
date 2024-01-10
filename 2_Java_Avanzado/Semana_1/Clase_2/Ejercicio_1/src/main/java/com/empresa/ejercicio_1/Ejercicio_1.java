
package com.empresa.ejercicio_1;

import com.empresa.ejercicio_1.models.Agente;
import com.empresa.ejercicio_1.models.Cliente;
import com.empresa.ejercicio_1.services.CentroDeLlamadas;

public class Ejercicio_1 {

    public static void main(String[] args) {
        CentroDeLlamadas centroDeLlamadas = new CentroDeLlamadas();

        // Iniciar agentes
        for (int i = 1; i <= 3; i++) {
            Thread hiloAgente = new Agente(centroDeLlamadas);
            hiloAgente.start();
        }

        // Simulación de múltiples llamadas concurrentes
        Cliente[] clientes = {
            new Cliente("Cliente 1"),
            new Cliente("Cliente 2"),
            new Cliente("Cliente 3"),
            new Cliente("Cliente 4"),
            new Cliente("Cliente 5")
        };

        // Simulación de llamadas
        for (Cliente cliente : clientes) {
            centroDeLlamadas.recibirLlamada(cliente);
        }
    }
}
