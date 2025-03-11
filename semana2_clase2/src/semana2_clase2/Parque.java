/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2_clase2;

/**
 *
 * @author Usuario
 */
public class Parque {
    //contadores globales
    private static int totalVisitantes=0;
    private static int totalVarones=0;
    private static int totalMujeres=0;
    private static int totalNiños=0;
    private static int totalIngresoVarones=0;
    private static int totalIngresoMujeres=0;
    private static int totalIngresoNiños=0;
    private static int totalIngresos=0;
    
    
    //atributos de instancia
    private String nombre;
    private String tipoSexo;
    
        
    
    //metodo Constructor
    public Parque(String nombre, String tipoSexo){
        this.nombre=nombre;
        this.tipoSexo=tipoSexo;
        contadorDinero(tipoSexo);
        contadorPersonas(tipoSexo);
    }
    
    //Metodo de clase - contador general
    private static void contadorDinero (String tipoSexo){        
        int total;       
        total= totalIngresoNiños + totalIngresoMujeres + totalIngresoVarones ;
         totalIngresos=total;
        switch (tipoSexo){
            case"Varón":totalIngresoVarones=totalIngresoVarones+10;break;
            case"Mujer":totalIngresoMujeres=totalIngresoMujeres+7;break;
            case"Niño":totalIngresoNiños=totalIngresoNiños+5;break;
        }
        
    }
    
    private static void contadorPersonas (String tipoSexo){
        totalVisitantes++;
        switch (tipoSexo){
            case"Varón":totalVarones++;break;
            case"Mujer":totalMujeres++;break;
            case"Niño":totalNiños++;break;
    }
}
    
    public static int getTotalIngresos(){return totalIngresos;}
    public static int getTotalIngresosVarones(){return totalIngresoVarones;}
    public static int getTotalIngresosMujeres(){return totalIngresoMujeres;}
    public static int getTotalIngresosNiños(){return totalIngresoNiños;}
    public static int getTotalVisitantes(){return totalVisitantes;}
    public static int getTotalVarones(){return totalVarones;}
    public static int getTotalMujeres(){return totalMujeres;}
    public static int getTotalNiños(){return totalNiños;}
    
    public String Mostrar (){
        return "Nombre: " + nombre + 
                "\nSexo: " + tipoSexo;
                
    }
}
