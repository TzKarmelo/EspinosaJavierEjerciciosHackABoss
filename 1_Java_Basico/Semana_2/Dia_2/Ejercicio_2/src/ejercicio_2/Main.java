
package ejercicio_2;

import ejercicio_2.modelos.Producto;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Producto telefono = new Producto(1, "telefono", "Iphone", "15 Pro Titanio", 1080.95, 1219.90, 10);
        Producto television = new Producto(2, "television", "Sony", "HD22TV", 350.99, 399.90, 15);
        Producto laptop = new Producto(3, "laptop", "Lenovo", "PTR45", 1190.65, 1675.75, 8);
        Producto auriculares = new Producto(4, "auriculares", "Samsung", "HiFi", 29.95, 35.90, 26);
        Producto cargador = new Producto(5, "cargador", "Lenovo", "proCharger", 10.40, 19.90, 20);
        Producto tablet = new Producto(6, "tablet", "Xaomi", "XA234M", 180.95, 249.90, 12);
        Producto smartwatch = new Producto(7, "smartwatch", "Amazfit", "150AMZ", 30.90, 46.99, 17);
        Producto radio = new Producto(8, "radio", "JVC", "JHFV2", 15.90, 21.80, 13);
        Producto despertador = new Producto(9, "despertador", "ChinaPro", "WakeUp", 9.95, 19.50, 11);
        Producto calculadora = new Producto(10, "calculadora", "RamCal", "4RT67", 4.75, 8.80, 17);
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(telefono);
        productos.add(television);
        productos.add(laptop);
        productos.add(auriculares);
        productos.add(cargador);
        productos.add(tablet);
        productos.add(smartwatch);
        productos.add(radio);
        productos.add(despertador);
        productos.add(calculadora);
        
        // Hay que crear o copiar un producto con las mismas propiedades y con los mismos getter para poder compararlos...
        
        Producto productoMayorPrecio = telefono;
       
        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecio.getPrecioVenta()) {
                productoMayorPrecio = producto;
            }            
        }
        
        System.out.println("El producto de mayor precio es: " + productoMayorPrecio);
        
        Producto productoMenorCosto = telefono;
        
        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < productoMenorCosto.getPrecioCosto()) {
                productoMenorCosto = producto;
            }            
        }
        
        System.out.println("\nEl producto de menor costo es: " + productoMenorCosto);
        
        productos.remove(4);  // Se le supone que la posicion 5 del array es el 4... 
        
        Producto productoMayorStock = telefono;
        
        for (Producto producto : productos) {
            if (producto.getCantidadStock() > productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }            
        }
        
        System.out.println("\nEl producto con mayor stock es: " + productoMayorStock);
        
        productoMayorStock.setCantidadStock(productoMayorStock.getCantidadStock() - 3);
        
        System.out.println("\nEl producto con mayor stock es: " + productoMayorStock);
        
    }
    
}
