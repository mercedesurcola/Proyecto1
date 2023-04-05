/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.proyecto1;

import java.util.Scanner;

/**
 *
 * @author merce
 */
public class Proyecto1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //Se crea una variable cadena (sString) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingrese un nombre");
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Su nombre es:  " + nombre);
    }
}
