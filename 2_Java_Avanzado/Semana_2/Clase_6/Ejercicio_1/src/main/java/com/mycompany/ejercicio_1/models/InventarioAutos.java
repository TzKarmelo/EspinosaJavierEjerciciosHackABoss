package com.mycompany.ejercicio_1.models;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        inventario.add(auto);
    }

    public List<T> buscarPorMarca(String marca) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<T> buscarPorAño(int año) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getAño() == año) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (T auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}
