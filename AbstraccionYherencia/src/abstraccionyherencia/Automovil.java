/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccionyherencia;

/**
 *
 * @author Usuario
 */
public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(String marca, String modelo, int año, int cantidadPuertas) {
        super(marca, modelo, año);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public double calcularMantenimiento() {
        double costo = 100;
        if (cantidadPuertas > 4) {
            costo += 50;
        }
        return costo;
    }
}
