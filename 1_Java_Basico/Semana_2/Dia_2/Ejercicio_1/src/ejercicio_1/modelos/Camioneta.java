package ejercicio_1.modelos;

public class Camioneta extends Vehiculo implements Combustion{
    
    private int capacidadTanque;
    private int consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int capacidadTanque, int consumoCombustible, int id, String placa, String marca, String modelo, int anio, int costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }
        
    @Override
    public int calcularAntiguedad() {
        return 2023-this.getAnio();        
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Cargando combustible...");
    }
       
    
}
