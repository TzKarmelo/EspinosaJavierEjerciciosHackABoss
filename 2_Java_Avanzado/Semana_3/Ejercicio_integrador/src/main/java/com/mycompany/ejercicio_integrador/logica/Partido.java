package com.mycompany.ejercicio_integrador.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private int puntuacionLocal;
    private int puntuacionVisitante;
    
    @ManyToOne
    @JoinColumn(name = "local_id")
    private Equipo local;
    @ManyToOne
    @JoinColumn(name = "visitante_id")
    private Equipo visitante;

    public Partido() {
    }

    public Partido(LocalDate fecha, int puntuacionLocal, int puntuacionVisitante, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.puntuacionLocal = puntuacionLocal;
        this.puntuacionVisitante = puntuacionVisitante;
        this.local = local;
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacionLocal() {
        return puntuacionLocal;
    }

    public void setPuntuacionLocal(int puntuacionLocal) {
        this.puntuacionLocal = puntuacionLocal;
    }

    public int getPuntuacionVisitante() {
        return puntuacionVisitante;
    }

    public void setPuntuacionVisitante(int puntuacionVisitante) {
        this.puntuacionVisitante = puntuacionVisitante;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", fecha=" + fecha + ", puntuacionLocal=" + puntuacionLocal + ", puntuacionVisitante=" + puntuacionVisitante + ", local=" + local + ", visitante=" + visitante + '}';
    }
    
    
}
