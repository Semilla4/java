/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;
import modelo.Vehiculo;
/**
 *
 * @author Usuario
 */
public interface IPeaje {
    void registrarVehiculo(Vehiculo vehiculo);
    int obtenerCantidadPorTipo(String tipo);
    double obtenerTotalRecaudado();
}
