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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int num;
        
        
        for(int i=1 ; i <5 ;  i++){
           System.out.println("Ingrese 4 numeros");
           num = leer.nextInt();
           System.out.print( num);
           
           
           for(int b=1 ; b <=num ;  b++){
           System.out.print("*");
           }
           
           System.out.println("");
                   
        }
                  
    }
       
       
       
       
       
       
    }
 
