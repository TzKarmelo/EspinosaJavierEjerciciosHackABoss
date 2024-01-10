

package com.empresa.ejercicio_1;

import com.empresa.ejercicio_1.exceptions.ReservaInvalidaException;
import com.empresa.ejercicio_1.services.ReservaService;
import java.util.InputMismatchException;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        ReservaService reservaSv = new ReservaService();
        
        try {
            
            reservaSv.creaReserva();
            
        } catch (ReservaInvalidaException e) {
            
            e.printStackTrace();
                        
        } catch (InputMismatchException e) {
            
            e.printStackTrace();
            System.out.println("\n Reserva no válida.");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }        
        
    }
}
