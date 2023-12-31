package com.empresa.ejercicio_2.services;

import com.empresa.ejercicio_2.exceptions.EmptyProductNameException;
import com.empresa.ejercicio_2.exceptions.EmptyProductPriceException;
import com.empresa.ejercicio_2.exceptions.EmptyProductQuantityException;
import com.empresa.ejercicio_2.exceptions.InvalidMenuEntryException;
import com.empresa.ejercicio_2.exceptions.InvalidProductNameException;
import com.empresa.ejercicio_2.exceptions.InvalidProductPriceException;
import com.empresa.ejercicio_2.exceptions.InvalidProductQuantityException;
import com.empresa.ejercicio_2.models.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

    public Product createProduct() throws InvalidMenuEntryException, InvalidProductNameException, InvalidProductPriceException, InvalidProductQuantityException, EmptyProductNameException, EmptyProductPriceException, EmptyProductQuantityException {

        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        List<Product> listaProductos = new ArrayList();

        boolean validacionMenu = false;

        do {
            int opcionMenu=0;
            try {
                
                System.out.println("\n1. Agregar Productos      2. Listar Inventario     3. Salir");

                System.out.print("\nOpción a escoger: ");

                if (sc.hasNextInt()) {
                    opcionMenu = sc.nextInt();
                  
                    
                } else {
                    throw new InvalidMenuEntryException();
                }

            } catch (InvalidMenuEntryException e) {
                System.out.println("\nError: " + e.getMessage());
            }

            switch (opcionMenu) {
                case 1:
                    Product nuevoProducto = new Product();

                    try {
                        // Nombre //////////////////////////////

                        boolean validacionNombre = false;

                        do {
                            System.out.print("\n\tIngrese el nombre del producto: ");
                            String nombre = sc.next();

                            if (nombre.trim().isEmpty()) {
                                throw new EmptyProductNameException(nombre);
                            } else {
                                if (!nombre.matches(".*\\d.*") && nombre.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")) {
                                    validacionNombre = true;
                                } else {
                                    throw new InvalidProductNameException(nombre);
                                }
                            }

                            nuevoProducto.setNombre(nombre);

                        } while (!validacionNombre);

                        // Precio ////////////////////////////////////////////
                        boolean validacionPrecio = false;
                        double precio = 0;

                        do {
                            System.out.print("\n\tIngrese el precio del producto (ej. 2.45): ");
                            String input = sc.next();

                            if (input.isEmpty()) {
                                throw new EmptyProductPriceException(precio);
                            } else {
                                if (input.matches("[0-9]+(\\.[0-9]+)?")) {
                                    precio = Double.parseDouble(input);
                                    validacionPrecio = true;
                                } else {
                                    throw new InvalidProductPriceException(precio);
                                }
                            }

                            nuevoProducto.setPrecio(precio);

                        } while (!validacionPrecio);

                        // Cantidad ////////////////////////////////////////////
                        boolean validacionCantidad = false;
                        int cantidad = 0;

                        do {
                            System.out.print("\n\tIngrese la cantidad de productos: ");
                            String input = sc.next();

                            if (input.isEmpty()) {
                                throw new EmptyProductQuantityException(cantidad);
                            } else {
                                if (input.matches("[0-9]+")) {
                                    cantidad = Integer.parseInt(input);
                                    validacionCantidad = true;
                                } else {
                                    throw new InvalidProductQuantityException(cantidad);
                                }
                            }

                            nuevoProducto.setCantidad(cantidad);

                        } while (!validacionCantidad);

                        listaProductos.add(nuevoProducto);

                    } catch (EmptyProductNameException | InvalidProductNameException | EmptyProductPriceException | InvalidProductPriceException | EmptyProductQuantityException | InvalidProductQuantityException e) {

                        System.out.println("\nError: " + e.getMessage());
                    }

                    break;

                case 2:
                    for (Product producto : listaProductos) {

                        System.out.println("\n"+producto.toString());

                    }

                    break;

                case 3:
                    System.out.println("\nAplicación finalizada.\n");
                    validacionMenu = true;
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, elija una opción del 1 al 3.");
                    break;
            }

        } while (!validacionMenu);

        sc.close();
        return product;
    }
}
