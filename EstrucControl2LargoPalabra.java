/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.proyecto1;

import java.util.Scanner;

/**
 *
 * @author merce
 */
public class EstrucControl2LargoPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner (System.in);
         String palabra;
         
         System.out.println("Ingrese una palabra");
         palabra = leer.next();
         
     //    while (palabra.equals)
         
         if (palabra.equalsIgnoreCase("eureka")){
             System.out.println("CORRECTO");
         } else
             System.out.println("INCORRECTO");
 
    }
    
}
