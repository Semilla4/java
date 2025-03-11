/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2_clase2;

/**
 *
 * @author Usuario
 */
public class Peaje {
    //Constructores globales
    private static int totalVehiculos=0;
    private static int totalAutos=0;
    private static int totalMotos=0;
    private static int totalCamion=0;
    
    //atributos de instacia
    private String placa;
    private String tipoVehiculo;
    
    //Creamos el metodo constructor
    public Peaje(String placa, String tipoVehiculo){
        this.placa=placa;
        this.tipoVehiculo=tipoVehiculo;
        incrementarContador(tipoVehiculo);
    }
    
    //Creamos nuestro metodo de clase(incrementar el contador general)
    private static void incrementarContador(String tipoVehiculo){
        totalVehiculos++;
        switch(tipoVehiculo){
            case"Auto": totalAutos++;break;
            case"Moto": totalMotos++;break;
            case"Camión": totalCamion++;break;
        }
    }
    
    public static int getTotalVehiculos(){return totalVehiculos;}
    public static int getTotalAutos(){return totalAutos;}
    public static int getTotalMotos(){return totalMotos;}
    public static int getTotalCamion(){return totalCamion;}
    
    //Metodo de instancia para mostrar la informacion
    public String mostrarInfo(){
        return "Placa: " + placa + "\nTipo de Vehiculo: " + tipoVehiculo;
    }
}
