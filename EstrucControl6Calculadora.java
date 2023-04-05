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
public class EstrucControl6Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num1, num2, menu;
        double res ;
        String seguro;
        boolean repito = false;
        
        System.out.println("Ingrese el nro 1 y despues el nro 2");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        res = 0;
        menu = 0;
        // seguro = "n";
        
       
        
        do {
             
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opción");
            menu = leer.nextInt();
            
        
        switch (menu){
            case 1: 
                res = num1+num2;
                System.out.println("El resultado es: " +res);
                menu = 0;
                break;
            case 2: 
                res = num1-num2;
                System.out.println("El resultado es: " +res);
                menu = 0;
                break;
            case 3: 
                res = num1*num2;
                System.out.println("El resultado es: " +res);
                menu = 0;
                break;
            case 4: 
                res = num1/num2;
                System.out.println("El resultado es: " +res);  
                menu = 0;
                break;
                
            case 5:
                System.out.println("Está seguro? (S/N)");
                seguro = leer.next();
               if (seguro.equalsIgnoreCase("s")){
                    System.out.println("CHAUU!!!");
                    repito = false;
                    break;
               }  else menu = 0;
           
               
        } 
               
        }  while (repito = true && menu != 5 );

        }
        

    }
  