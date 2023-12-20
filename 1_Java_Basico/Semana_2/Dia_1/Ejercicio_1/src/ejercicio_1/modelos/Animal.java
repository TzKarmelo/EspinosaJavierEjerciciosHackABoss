package ejercicio_1.modelos;

public class Animal {
    
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;
    private String alimentacion;

    public Animal() {
    }

    public Animal(int id, String nombre, int edad, String tipoPiel, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.alimentacion = alimentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", tipoPiel=" + tipoPiel + ", alimentacion=" + alimentacion + '}';
    }
    
    public void Saludar() {
        
        System.out.println("Hola, soy un animal.");
        
    }
    
}
