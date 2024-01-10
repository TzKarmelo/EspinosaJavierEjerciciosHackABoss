package ejercicio_1.modelos;

public class Mamifero extends Animal{
    
    private int numPatas;
    private String reproduccion;
    private String colorPelo;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int numPatas, String reproduccion, String colorPelo, String habitat, int id, String nombre, int edad, String tipoPiel, String alimentacion) {
        super(id, nombre, edad, tipoPiel, alimentacion);
        this.numPatas = numPatas;
        this.reproduccion = reproduccion;
        this.colorPelo = colorPelo;
        this.habitat = habitat;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numPatas=" + numPatas + ", reproduccion=" + reproduccion + ", colorPelo=" + colorPelo + ", habitat=" + habitat + '}';
    }
    
    @Override
    public void Saludar() {
        System.out.println("Hola, soy un mamífero.");
    }
    
}
