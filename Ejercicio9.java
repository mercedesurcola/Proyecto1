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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);

    int j, suma, num;
    suma = 0 ;

    for(int i=1 ; i <6 ;  i++){

        System.out.println("Ingrese un número");
        num = leer.nextInt();

            if (num == 0){
                System.out.println("Se capturó el numero cero");
                break;   //acá corto el bucle
             }
            else 
             suma +=  num;
         
    }
    System.out.println("La suma es de: " + suma);
  }
}
