/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2_clase2;


public class Factura {
    private static int contadorFacturas=1000; //atributo estatico
    private int numero;
    private String cliente;
    private double monto;
    
    public Factura(String cliente, double monto){
        this.numero=++contadorFacturas;
        this.cliente=cliente;
        this.monto=monto;
    }
    
    //Metodos propios
    
    public String mostrarInformacion(){
        return "Factura Nro: " + numero +
                "\nCliente: " + cliente +
                "\nMonto: S/" + monto;
    }
    
    public static int getTotalFacturas(){
        return contadorFacturas-1000;
    }
    
}
