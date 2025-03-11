/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase2;

/**
 *
 * @author Usuario
 */
public class Producto {
    private String producto;
    private double precio;
    private int cantidad;
    
    
    public Producto(String producto, double precio, int cantidad){
        this.producto=producto;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    
    public String getProducto() {
        return producto;
    }

    
    public double getPrecio() {
        return precio;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    
    public void setPrecio(double nuevoPrecio) {
        if(nuevoPrecio>0)
        this.precio = nuevoPrecio;
        else
            throw new IllegalArgumentException("El precio tiene que ser mayor a 0");
    }
    
    
    public void agregarStock (int cantidad){
        if(cantidad>0)
            this.cantidad+=cantidad;  
        else
            throw new IllegalArgumentException("La cantidad debe de ser un entero positivo");    
    }
    
    public boolean vender (int cantidad){
        if(cantidad >0 && cantidad <= this.cantidad){
            this.cantidad-=cantidad;
            return true;
            }
        return false;
    }
    public String mostrar(){
        return "producto: " + producto +
                "\nPrecio: " + precio +
                "\nStock disponible: " + cantidad;
    }
}
