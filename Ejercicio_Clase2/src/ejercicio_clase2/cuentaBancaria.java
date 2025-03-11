/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase2;

/**
 *
 * @author Usuario
 */
public class cuentaBancaria {
    
    private String titular;
    private double saldo;
    
    public cuentaBancaria (String titular, double saldoInicial){
        this.titular=titular;
        this.saldo=saldoInicial;
    }

    
    public String getTitular() {
        return titular;
    }

   
    public double getSaldo() {
        return saldo;
    }
    
    //Crear nuestros metodos propios
    public void depositar(double monto){
        if(monto>0)saldo+=monto;
    }
    
    public boolean retirar (double monto){
        if(monto>0 && monto <= saldo){
            saldo-=monto;
            return true;
        }
    return false;
    }
}
