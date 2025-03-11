/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase2;

/**
 *
 * @author Usuario
 */
public class Alumno {
    public int n1, n2, n3, n4;
    
    public float calcularPromedio(int n1, int n2, int n3, int n4){
        float promedio=(n1+n2+n3+n4)/4;
        return promedio;
    }
    
    public int determinarMayor(int n1, int n2, int n3, int n4){
        int mayor = 0;
        if(n1>n2) 
            mayor = n1;
        else
            mayor = n2;
        if (n3>mayor)
            mayor = n3;
        if (n4>mayor)
            mayor = n4;
        return mayor;
    }
    
    public int determinarMenor(int n1, int n2, int n3, int n4){
        int menor=0;
        if (n1<n2)
            menor = n1;
        else
            menor=n2;
        if(n3<menor)
            menor=n3;
        if(n4<menor)
            menor=n4;
        return menor;
    }
}
