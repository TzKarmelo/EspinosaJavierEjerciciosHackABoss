package com.mycompany.ejercicio_2.models;

public class Mascota<T> {
    private String nombre;
    private int edad;
    private String especie;
    private T id;

    public Mascota(T id, String nombre, int edad, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public T getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", id=" + id + '}';
    }
    
    
}

