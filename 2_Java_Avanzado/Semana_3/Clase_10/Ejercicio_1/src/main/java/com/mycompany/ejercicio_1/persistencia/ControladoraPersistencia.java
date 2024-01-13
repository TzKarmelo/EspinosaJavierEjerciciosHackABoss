
package com.mycompany.ejercicio_1.persistencia;

import com.mycompany.ejercicio_1.logica.Votos;
import java.util.List;

public class ControladoraPersistencia {

    public ControladoraPersistencia() {
    }
    
    VotosJpaController votoJpa = new VotosJpaController();
    
    public void crearVoto (Votos voto) {
        votoJpa.create(voto);
    }
    
    public List <Votos> traerVotos() {
        return votoJpa.findVotosEntities();
    } 
    
}
