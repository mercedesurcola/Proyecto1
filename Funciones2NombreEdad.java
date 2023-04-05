package egg.proyecto1;

import java.util.Scanner;

public class Funciones2NombreEdad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int stop = 0;
        
        do{            
            System.out.println("Ingrese nombre y edad");       
            String nombre = leer.next();
            int edad = leer.nextInt();
            Persona(nombre, edad);
     

        //    int stop = 0;
            System.out.println("Desea Seguir (1 para NO)");
            stop = leer.nextInt();
           /* if (frenar == 1){
              //  stop = 1;
                }*/
           System.out.println("stop: " +stop);

        }  while (stop != 1);
    }
    
    
public static void Persona(String nombre, int edad){
    String a;
    
    if (edad >=18){
        a = "Mayor";
    } else {
        a = "Menor";
    }
    
    System.out.println("Hola " + nombre + ". Sos " +a);

}
    
}
