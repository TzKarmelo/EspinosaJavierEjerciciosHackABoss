
package com.empresa.ejercicio_2;

import com.empresa.ejercicio_2.services.ProductService;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        ProductService productoSv = new ProductService();
        
        try {
            
            productoSv.createProduct();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
}
