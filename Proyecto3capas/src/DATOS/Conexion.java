package DATOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3306/bdmatricula";
    private static final String usuario = "root";
    private static final String password = "";
    
    public static Connection obtenerConexion()throws SQLException{
        return DriverManager.getConnection(url, usuario, password);
    }
    
    public static void cerrarConexion(Connection cnx)throws SQLException{
        if(cnx != null && !cnx.isClosed()){
            cnx.close();
        }
    }
    
}
