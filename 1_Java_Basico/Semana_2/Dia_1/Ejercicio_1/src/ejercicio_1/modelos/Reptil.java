
package ejercicio_1.modelos;

public class Reptil extends Animal {
    
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil() {
    }

    public Reptil(double longitud, String tipoEscamas, String tipoVeneno, String habitat, int id, String nombre, int edad, String tipoPiel, String alimentacion) {
        super(id, nombre, edad, tipoPiel, alimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Reptil{" + "longitud=" + longitud + ", tipoEscamas=" + tipoEscamas + ", tipoVeneno=" + tipoVeneno + ", habitat=" + habitat + '}';
    }

    @Override
    public void Saludar() {
        System.out.println("Hola, soy un reptil.");
    }
     
    
}
