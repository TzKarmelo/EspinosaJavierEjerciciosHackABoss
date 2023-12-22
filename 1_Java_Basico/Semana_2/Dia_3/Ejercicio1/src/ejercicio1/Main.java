
package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad"; 
        String usuario = "root"; 
        String contraseña = ""; 
  
        try {            
            Connection conexion=DriverManager.getConnection(url,usuario,contraseña);
            Statement statement = conexion.createStatement();
            
            String sql = "SELECT * FROM estudiantes"; 
            ResultSet resultado = statement.executeQuery(sql);
            
            // Muestra la base de datos
            while(resultado.next()){
                int id=resultado.getInt("id");
                String nombre=resultado.getString("nombre");
                int edad=resultado.getInt("edad");
                double calificacion=resultado.getDouble("calificacion");
                
                System.out.println("\nID "+id+" Nombre "+nombre+" Edad "+edad+" Calificacion "+calificacion);
            }
            
            // Agrega un nuevo estudiante
            String nuevoEstudiante = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Carlos', 21, 8.5)";
            int filasAfectadas = statement.executeUpdate(nuevoEstudiante);
            if (filasAfectadas > 0) {
                System.out.println("\nSe ha agregado un nuevo estudiante correctamente.");
            } else {
                System.out.println("\nNo se ha podido agregar el nuevo estudiante.");
            }
            
            // Muestra la base de datos nuevamente con el usuario añadido...
            
            ResultSet resultado2 = statement.executeQuery(sql);
            while(resultado2.next()){
                int id=resultado2.getInt("id");
                String nombre=resultado2.getString("nombre");
                int edad=resultado2.getInt("edad");
                double calificacion=resultado2.getDouble("calificacion");
                
                System.out.println("\nID "+id+" Nombre "+nombre+" Edad "+edad+" Calificacion "+calificacion);
            }
            
            // Cierra la conexión y recursos
            resultado.close();
            resultado2.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}