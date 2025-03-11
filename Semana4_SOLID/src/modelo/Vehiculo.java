/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    protected String tipo;
    protected double tarifa;
    
    //metodo constructor para inicializar el programa
    public Vehiculo (String tipo, double tarifa){
        this.tipo=tipo;
        this.tarifa=tarifa;
    }
    
    //metodos de acceso
    
    public String getTipo(){
        return tipo;
    }
    
    public double getTarifa(){
        return tarifa;
    }
    
}
