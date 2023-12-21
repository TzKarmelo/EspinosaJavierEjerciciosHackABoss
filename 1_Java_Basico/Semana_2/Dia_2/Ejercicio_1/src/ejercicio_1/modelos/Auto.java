package ejercicio_1.modelos;

public class Auto extends Vehiculo implements Electrico{
    
    private int capacidadBateria;   // En mah
    private int autonomia;          // En horas

    public Auto() {
    }

    public Auto(int capacidadBateria, int autonomia, int id, String placa, String marca, String modelo, int anio, int costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
        
    @Override
    public int calcularAntiguedad() {
        return 2023-this.getAnio();        
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando electricidad...");
    }
       
}
