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
public class EstrucControlExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         
         int hora = 0;
         int horas = 0;
         int min = 0;
         int mins = 0;
         int min2 = 0;
         int seg2 = 0;
         
         System.out.println("Ingrese cantiadd de minutos");
         int seg = leer.nextInt();
         seg2 = seg;
         
         if (seg2 >= 3600) {
             hora = seg2 / 3600;
             System.out.println("Son horas: " +hora);
             
             if (seg2%3600 > 0 || seg2 > 60 ){
                 System.out.println("tiene minutos");
             }
                  
         }


    }
}

      

   
