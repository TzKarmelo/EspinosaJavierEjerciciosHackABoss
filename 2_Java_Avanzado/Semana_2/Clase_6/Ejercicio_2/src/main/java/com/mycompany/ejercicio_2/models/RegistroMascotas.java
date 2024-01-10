package com.mycompany.ejercicio_2.models;

import java.util.*;
import java.util.Random;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        registro = new ArrayList<>(); 
    }

    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public List<Mascota<T>> buscarPorEspecie(String especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public int cantidadTotalMascotas() {
        return registro.size();
    }

    public Mascota<T> generarDatosAleatorios() {
        Random rand = new Random();
        String[] nombres = {"Balú", "Firulais", "Boby", "Sheina", "Dollar", "Canelo"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        String nombreAleatorio = nombres[rand.nextInt(nombres.length)];
        int edadAleatoria = rand.nextInt(15) + 1;
        String especieAleatoria = especies[rand.nextInt(especies.length)];

        return new Mascota<>(null, nombreAleatorio, edadAleatoria, especieAleatoria);
    }
}
