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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nro 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese el nro 2");
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos son mayores a 25");
        } else if (num1 > 25){
            System.out.println("El nro 1 es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El nro 2 es mayor a 25");
        } 
           System.out.println("Ninguno de los dos nros es mayor a 25");

    }
}
