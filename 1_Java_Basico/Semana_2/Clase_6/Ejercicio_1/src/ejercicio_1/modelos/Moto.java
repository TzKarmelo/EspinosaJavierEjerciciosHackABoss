
package ejercicio_1.modelos;

public class Moto extends Vehiculo implements Combustion{
    
    private int cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(int cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, int costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
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
