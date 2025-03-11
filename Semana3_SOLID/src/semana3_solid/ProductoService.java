/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_solid;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductoService {
    private List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto (Producto prod){
        productos.add(prod);
        System.out.println("Producto Agregado");
    }
    
    public List<Producto> listarProductos(){
        return productos;
    }
}
