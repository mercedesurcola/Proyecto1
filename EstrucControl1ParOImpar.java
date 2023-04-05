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
public class EstrucControl1ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        if (num%2 != 0){
             System.out.println("El numero es impar");
        } else
            System.out.println("El numero es par");
           
    } 
    
}

