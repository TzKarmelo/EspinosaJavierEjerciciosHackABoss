package com.empresa.ejercicio_1.services;

import com.empresa.ejercicio_1.models.Cliente;
import java.util.ArrayList;
import java.util.List;

public class CentroDeLlamadas {
    private final int NUM_AGENTES = 3;
    private final List<Cliente> llamadas = new ArrayList<>();
    private int indiceLlamada = 0;

    public synchronized void recibirLlamada(Cliente cliente) {
        llamadas.add(cliente);
        System.out.println("Llamada recibida de " + cliente.getNombre());
        atenderLlamada(); 
    }

    public synchronized void atenderLlamada() {
        while (indiceLlamada < llamadas.size()) {
            Cliente cliente = llamadas.get(indiceLlamada);
            System.out.println("Llamada de " + cliente.getNombre() + " atendida por " + Thread.currentThread().getName());
            indiceLlamada++;
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

