
package com.mycompany.ejercicio_2.persistence;
import com.mycompany.ejercicio_2.services.PlatilloJpaController;
import com.mycompany.ejercicio_2.models.Platillos;
import com.mycompany.ejercicio_2.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PlatilloJpaController platilloJpa = new PlatilloJpaController();
    
    public void crearPlatillo(Platillos platillo) {
      platilloJpa.create(platillo);
  }
  
  public void borrarPlatillo(int id) {
      try {
          platilloJpa.destroy(id);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public List<Platillos> traerPlatillos () {
      return platilloJpa.findPlatilloEntities();
  }
  
  public void modificarPlatillo (Platillos platillo) {
  
      try {
          platilloJpa.edit(platillo);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
}
