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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los Grados Centrígrados");
        int gracent = leer.nextInt();
        double grafar = 32+(9*gracent/5);
        
        System.out.println("En grados Fahrenheit es: " +  grafar );
    }
    
}
