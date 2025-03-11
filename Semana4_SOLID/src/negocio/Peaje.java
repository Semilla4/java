/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import modelo.Vehiculo;
import java.util.HashMap;
import java.util.Map;
        

public class Peaje implements IPeaje{
    private Map<String, Integer> cantidadVehiculos = new HashMap<>();
    private double totalRecaudado=0;
    
    public void registrarVehiculo(Vehiculo vehiculo){
        cantidadVehiculos.put(vehiculo.getTipo(), cantidadVehiculos.getOrDefault(vehiculo.getTipo(), 0)+1);
        totalRecaudado+=vehiculo.getTarifa();
    }
    
    public int obtenerCantidadPorTipo (String tipo){
        return cantidadVehiculos.getOrDefault(tipo, 0);
    }
    
    public double obtenerTotalRecaudado(){
        return totalRecaudado;
    }
    
    
}
