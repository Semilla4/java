/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_tecnicasconbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/bdservicio";
    private static final String usuario="root";
    private static final String contrasena="";
    
    //Metodo para conectar a la base de datos
    public static Connection conectar(){
        Connection cnx = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx= DriverManager.getConnection(url,usuario, contrasena);
            System.out.println("Conexion Exitosa");
        }
        catch(ClassNotFoundException e){
            System.err.println("Error: no se encontro el driver JDBC");
            e.printStackTrace();
        }
        catch (SQLException e){
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return cnx;
    }
    
    //metodo para cerrar la conexion
    
    public static void cerrarConexion (Connection cnx){
        try{
            if (cnx!=null && !cnx.isClosed()){
                cnx.close();
                System.out.println("conexion cerrada");
            }
        }catch (SQLException e){
            System.err.println("Error al cerrar ,a conexion" + e.getMessage());
            e.printStackTrace();
        }
    }
}
