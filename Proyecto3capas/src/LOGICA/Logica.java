package LOGICA;
import DATOS.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Logica {
    //Metodo para mostrar los registros
    public List<String[]> obtenerRegistros(){
        List<String[]> registros = new ArrayList<>();
        
        try(Connection cnx = Conexion.obtenerConexion();
                PreparedStatement statement =
                        cnx.prepareStatement("SELECT * FROM alumnos"))
        {
            ResultSet rs= statement.executeQuery();
            while(rs.next()){
                String[] registro=new String[4];
                registro[0]=rs.getString("id");
                registro[1]=rs.getString("Nombre");
                registro[2]=rs.getString("Apellidos");
                registro[3]=rs.getString("Distrito");
                registros.add(registro);
            }
                }catch(SQLException e){
                    e.printStackTrace();
                }
                return registros;
    }
    
    //Insertar Registros
    
    public void insertarRegistros(String nombre, String apellidos, String distrito){
        try (Connection cnx= Conexion.obtenerConexion();
                PreparedStatement st =
                        cnx.prepareStatement ("INSERT INTO alumnos (Nombre,Apellidos,Distrito)"
                + "VALUES(?,?,?)"))
                {
                    st.setString(1, nombre);
                    st.setString(2, apellidos);
                    st.setString(3, distrito);
                    st.executeUpdate();
                }catch (SQLException e){
                    e.printStackTrace();
                        }
     }
    
    
}
        

    
