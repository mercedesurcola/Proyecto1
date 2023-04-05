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
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       Scanner leer = new Scanner (System.in);
       
       do{
           System.out.println("Ingrese un num entero positivo");
           num = leer.nextInt();
           if (num>1000){
               System.out.println("Este progrma va a tardar. Estas seguro? (s/n)");
               String confirma = leer.next();
               if (confirma.equals("s")){
                    break;  //break detiene el bucle y continua con el proximo bloque
               }
           }
          
       } while (num <=0 || num > 1000);
       
       int j, suma;
       for(int i=1 ; i <num ;  i++){
           if (i%2 != 0)
               continue;  //continue: detiele la iteración actual y salta a la siguiente
           suma = 0;
           j = 1;
           while (j<=i){
               suma += j;
               j++;
           }
           System.out.println("La sma de los " +i + " numeros reales es : " +suma);
                   
       }

       
    }
    
}
