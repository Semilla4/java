/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase2;

/**
 *
 * @author Usuario
 */
public class procesoNotas {
    private String nombre;
    private int n1,n2,n3,n4;
    
    
    public procesoNotas (String nombre, int n1,int n2,int n3,int n4){
        this.nombre=nombre;
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @return the n3
     */
    public int getN3() {
        return n3;
    }

    /**
     * @return the n4
     */
    public int getN4() {
        return n4;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @param n3 the n3 to set
     */
    public void setN3(int n3) {
        this.n3 = n3;
    }

    /**
     * @param n4 the n4 to set
     */
    public void setN4(int n4) {
        this.n4 = n4;
    }
   
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;    
    }
    
    public double resultado(int n1,int n2,int n3,int n4) {
        double promedio= (n1+n2+n3+n4)/4;
        return promedio;
    }
    
    public String condicion (double promedio){
        
        if (promedio > 13){
            return "Aprobado";
        }else{
            return "Desaprobado";
            }  
            
    }
}
