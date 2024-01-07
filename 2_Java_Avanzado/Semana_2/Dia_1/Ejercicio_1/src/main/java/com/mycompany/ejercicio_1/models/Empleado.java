
package com.mycompany.ejercicio_1.models;

public class Empleado {
    
    private String nombre;
    private int salario;
    private String categoria;

    public Empleado() {
    }

    public Empleado(String nombre, int salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", categoria=" + categoria + '}';
    }
    
        
}
