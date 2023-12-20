package ejercicio_2.modelos;

public class Zapato extends Vestimenta {
    
    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(String material, String tipoCierre, int codigo, String nombre, double precio, String marca, int talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String toString() {
        return "Zapato{" + "material=" + material + ", tipoCierre=" + tipoCierre + '}';
    }
    
    @Override
    public void mostrarMensaje() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }
    
}
