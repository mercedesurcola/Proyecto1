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
public class Condicional {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        opinion = leer.nextInt();
       // System.out.println("opinion: " + opinion);
        
        if (opinion >= 1 && opinion <= 5 ) {
           // System.out.println("Entrooooo");
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantástico!!!");
                    break;   
                
            }
        } else if (opinion < 0){
            System.out.println("No puede ser un nro negativo");
        }else if (opinion == 0){
            System.out.println("No puede ser 0");
        } else{
            System.out.println("Se te fue la mano!!" + opinion );
        }
        System.out.println("Chau");
    
    }
}
