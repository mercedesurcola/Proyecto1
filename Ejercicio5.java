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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        int doble = numero*2;
        int triple = numero*3;
        double raiz = Math.sqrt(numero);

        System.out.println("Doble: " +  doble );
        System.out.println("Triple: " +  triple );
        System.out.println("Raiz: " +  raiz );
    }
    
}
