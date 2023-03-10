package ec.edu.intsuperior.controlador;




import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
   Connection conectar = null;
   String usuario ="root";
   String contrasenia ="";
   String bd ="dblogin";
   String ip ="localhost";
   String puerto ="3306";
   
   String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
   
   public Connection estableceConexion (){
   
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection(cadena, usuario, contrasenia);
           JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos ");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"No se logro conectar a la base de datos" + e.toString());
       }
   return conectar;
   }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
