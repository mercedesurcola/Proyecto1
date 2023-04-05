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
public class Ejercicio10bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int num, num2, num3, num4;

           System.out.println("Ingrese 4 numeros");
           num = leer.nextInt();
           num2 = leer.nextInt();
           num3 = leer.nextInt();
           num4 = leer.nextInt();

        //NUMERO 1
           System.out.print(num);
           for(int b=1 ; b <=num ;  b++){
           System.out.print("*");
           }
           System.out.println("");
        
        //NUMERO 2
           System.out.print(num2);
           for(int c=1 ; c <=num2 ;  c++){
           System.out.print("*");
           }
           System.out.println("");
        
        //NUMERO 3  
           System.out.print(num3);
           for(int d=1 ; d <=num3 ;  d++){
           System.out.print("*");
           }      
           System.out.println("");
           
        //NUMERO 4
           System.out.print(num4);
           for(int e=1 ; e <=num4 ;  e++){
           System.out.print("*");
           }      
           System.out.println("");
                   
        }
                  
}
    
