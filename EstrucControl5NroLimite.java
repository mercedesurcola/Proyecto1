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
public class EstrucControl5NroLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          
          int limite, num, suma;
          System.out.println("Ingrese un nro limite");
          limite = leer.nextInt();
          suma =0 ; 
          
           for(int i=1 ; suma < limite ;  i++){
         //      System.out.println("entro");
           
               System.out.println("Ingrese un numero");
               num = leer.nextInt();
               suma += num;
               
           }
        //   System.out.println("La suma llegó a " +suma);
            
          
    }
    
}
