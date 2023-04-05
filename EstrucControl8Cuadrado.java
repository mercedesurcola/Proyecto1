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
public class EstrucControl8Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //int num;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        //REPETICION 1
         for(int i=1 ; i <= num ;  i++){
                 
                for(int a=1 ; a <= num ;  a++) 
    
                 if (a == 1 || a == num){
                     System.out.print("*");
                 }else if (i == 1 || i == num){
                     System.out.print("*");
                 }else
                    System.out.print(" ");  
            
             System.out.println("");      
             }
                 
       }
    
}
