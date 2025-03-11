/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2_clase2;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private static int contadorEmpleados=0;
    private int id;
    private String nombre;
    
    //Metodo constructor
    public Empleado (String nombre){
        this.id=++contadorEmpleados;
        this.nombre=nombre;
    }
    
    //metodos propios
    public String mostrarInfo(){
        return "ID: " + id + "\nNombre: " + nombre;
    }
    
    public static int getTotalEmpleados(){
        return contadorEmpleados;
    }
}
