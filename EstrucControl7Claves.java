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
public class EstrucControl7Claves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        
       String clave, primera, ultima;
       int largo, anterior, correcto, incorrecto;
       boolean repito = true ;
       correcto = 0;
       incorrecto = 0;
   
       do{
      
           System.out.println("Ingrese una clave");
           clave = leer.next();

           //RECUPERO LOS DATOS QUE NECESITO
           largo = clave.length();
           primera = clave.substring(0,1);
           anterior = largo -1;
           ultima = clave.substring(anterior,largo);

               
          /*System.out.println("El largo es de: " +largo);
           System.out.println("El NUEVO largo es de: " +largo);
           System.out.println("la primera es: " + primera);
           System.out.println("la ultima es: " + ultima);
           System.out.println("salgo es  : " +salgo);*/
          
            if (clave.equalsIgnoreCase("&")){
                // System.out.println("FINAL DE LOS ENVIOS");
                 repito = false;
                 break;
            }

             if (largo <= 5 && primera.equalsIgnoreCase("A") && ultima.equalsIgnoreCase("O")  )  {
                correcto ++;
               // System.out.println("CORRECTOS: " +correcto);
                repito = true;
                continue;

             } else
                incorrecto ++;
              //  System.out.println("INCORRECTO: " +incorrecto);
                repito = true;
                continue;
                                    
        } while (repito = true);
        System.out.println("Total de intentos Correctos: " + correcto);
        System.out.println("Total de intentos Incorrectos: " + incorrecto);
        
    }
    
}
