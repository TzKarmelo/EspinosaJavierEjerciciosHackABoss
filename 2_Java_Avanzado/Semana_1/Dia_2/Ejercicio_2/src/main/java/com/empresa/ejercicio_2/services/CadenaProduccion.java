package com.empresa.ejercicio_2.services;

public class CadenaProduccion {
    private final Object ensamblajeTrabajador = new Object();
    private final Object controlCalidadTrabajador = new Object();

    public void realizarTarea(String trabajador) throws InterruptedException {
        ensamblarProducto(trabajador);
        hacerControlCalidad(trabajador);
        embalarProducto(trabajador);
    }

    private void ensamblarProducto(String trabajador) throws InterruptedException {
        synchronized (ensamblajeTrabajador) {
            System.out.println(trabajador + " está ensamblando un producto.");
            Thread.sleep(2000); 
            System.out.println(trabajador + " ha terminado de ensamblar.");
        }
    }

    private void hacerControlCalidad(String trabajador) throws InterruptedException {
        synchronized (controlCalidadTrabajador) {
            System.out.println(trabajador + " está realizando control de calidad.");
            Thread.sleep(1500); 
            System.out.println(trabajador + " ha finalizado el control de calidad.");
        }
    }

    private void embalarProducto(String trabajador) throws InterruptedException {
        System.out.println(trabajador + " está embalando el producto.");
        Thread.sleep(1000); 
        System.out.println(trabajador + " ha terminado de embalar.");
    }
}

