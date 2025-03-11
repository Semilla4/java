/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnicapoo;

/**
 *
 * @author Usuario
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado (String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
    
    public String mostrarDatos (){
        return "Empleado: " + nombre + "\n Salario: S/. " + salario;
    }
}
