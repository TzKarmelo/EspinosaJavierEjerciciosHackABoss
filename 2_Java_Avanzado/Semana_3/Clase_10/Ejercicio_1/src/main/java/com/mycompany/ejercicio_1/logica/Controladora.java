
package com.mycompany.ejercicio_1.logica;

import com.mycompany.ejercicio_1.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    public void crearVoto(Votos voto) {
        controladora.crearVoto(voto);
    }
    
    public List<Votos> traerVotos(){
        return controladora.traerVotos();
    }
    
}
