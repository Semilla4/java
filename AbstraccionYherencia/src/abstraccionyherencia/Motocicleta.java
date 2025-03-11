/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccionyherencia;

/**
 *
 * @author Usuario
 */
public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String marca, String modelo, int año, int cilindraje) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public double calcularMantenimiento() {
        double costo = 50;
        if (cilindraje > 250) {
            costo += 25;
        }
        return costo;
    }
}
