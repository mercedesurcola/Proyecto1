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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tipoMotor;
        
        System.out.println("Ingrese el tipo de Motor");
        tipoMotor = leer.nextInt();

        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break;
            case 3:
                System.out.println("es de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
           default:
            System.out.println("No existe valor");      
            }
    }
}
    