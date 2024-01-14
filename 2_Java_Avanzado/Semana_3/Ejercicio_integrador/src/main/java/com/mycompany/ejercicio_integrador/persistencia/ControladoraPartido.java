
package com.mycompany.ejercicio_integrador.persistencia;

import com.mycompany.ejercicio_integrador.logica.Partido;
import com.mycompany.ejercicio_integrador.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Logger;


public class ControladoraPartido {
    
    PartidoJpaController equipoJPA = new PartidoJpaController();

    public void crearPartido(Partido partido) {
        equipoJPA.create(partido);
    }

    public void eliminarPartido(int id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraEquipo.class.getName());

        }
    }

    public void editarPartido(Partido partido){
        try {
            equipoJPA.edit(partido);
        } catch (Exception e) {
             Logger.getLogger(ControladoraEquipo.class.getName());
        }
    }
    
    public List<Partido> traerPartidos() {
        return equipoJPA.findPartidoEntities();
    }
    
}
