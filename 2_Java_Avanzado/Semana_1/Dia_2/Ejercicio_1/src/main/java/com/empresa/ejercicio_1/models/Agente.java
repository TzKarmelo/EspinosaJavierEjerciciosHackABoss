package com.empresa.ejercicio_1.models;

import com.empresa.ejercicio_1.services.CentroDeLlamadas;

public class Agente extends Thread {
    private final CentroDeLlamadas centroDeLlamadas;

    public Agente(CentroDeLlamadas centroDeLlamadas) {
        this.centroDeLlamadas = centroDeLlamadas;
    }

    @Override
    public void run() {
        centroDeLlamadas.atenderLlamada();
    }
}
