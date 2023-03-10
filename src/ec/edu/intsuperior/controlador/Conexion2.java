
package ec.edu.intsuperior.controlador;

import java.sql.*;

public class Conexion2 {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
    cn = DriverManager.getConnection("jdbc::mysql://localhost/dblogin", "root", "24686218");
        System.out.println("Conexion exitosa con la base de Datos");
    }catch(Exception e) {  
        System.out.println(e.getMessage());
    }return cn;
    
    }
    
    Statement createStatement(){
    throw new UnsupportedOperationException("No soportado");
    
    }
}
