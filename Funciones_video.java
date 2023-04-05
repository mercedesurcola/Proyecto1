package egg.proyecto1;

import java.util.Scanner;

public class Funciones_video {

    public static void main(String[] args) {
        
        int resultado = suma (10,10);        
        System.out.println("Resultdo: " +resultado);
        
        saludoPersonalizado("Mercedes");
                
        Scanner leer = new Scanner(System.in);    
        String nombre;
        nombre = leer.next();
        saludoPersonalizado(nombre);
        
        saludoPersonalizado(leer.next());
        
    }
 
    public static int suma(int a, int b){      
        //Logica
        int res = a+b;              
        return res;
    }
    
    
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + ". Como estás?");
        
    }
    
    
}
