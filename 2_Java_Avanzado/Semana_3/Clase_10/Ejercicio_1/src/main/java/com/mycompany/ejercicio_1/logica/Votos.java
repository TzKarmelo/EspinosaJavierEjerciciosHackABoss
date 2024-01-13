
package com.mycompany.ejercicio_1.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Votos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String partido;

    public Votos() {
    }

    public Votos(String partido) {
        this.partido = partido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Votos{" + "id=" + id + ", partido=" + partido + '}';
    }
    
    

    
}

