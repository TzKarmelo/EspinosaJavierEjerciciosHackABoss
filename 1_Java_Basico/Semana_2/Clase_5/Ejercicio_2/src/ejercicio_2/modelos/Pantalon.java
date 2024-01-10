package ejercicio_2.modelos;

public class Pantalon extends Vestimenta {
    
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(String estilo, String tipoTejido, int codigo, String nombre, double precio, String marca, int talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "estilo=" + estilo + ", tipoTejido=" + tipoTejido + '}';
    }
    
    @Override
    public void mostrarMensaje() {
        System.out.println("Estos pantalones son de estilo: " + getEstilo());
    }
    
}
