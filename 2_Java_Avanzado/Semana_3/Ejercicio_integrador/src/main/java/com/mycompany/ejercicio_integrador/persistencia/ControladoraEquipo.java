package com.mycompany.ejercicio_integrador.persistencia;

import com.mycompany.ejercicio_integrador.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.ejercicio_integrador.logica.Equipo;
import java.util.List;
import java.util.logging.Logger;

public class ControladoraEquipo {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }

    public void eliminarEquipo(int id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraEquipo.class.getName());

        }
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception e) {
            Logger.getLogger(ControladoraEquipo.class.getName());
        }
    }

    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }

    public Equipo traerEquipoPorId(int id) {
        return equipoJPA.findEquipo(id);
    }
    
}
