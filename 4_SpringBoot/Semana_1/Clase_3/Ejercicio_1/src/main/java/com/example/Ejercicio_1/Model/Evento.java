package com.example.Ejercicio_1.Model;

public class Evento {

    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;
    private String ponente;

    public Evento() {
    }

    public Evento(int id, String titulo, String descripcion, String fecha, String hora, String lugar, String ponente) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPonente() {
        return ponente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", ponente=" + ponente + '}';
    }

}
