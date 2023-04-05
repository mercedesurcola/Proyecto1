
package egg.proyecto1;

import java.util.Scanner;

public class ArreglosTeorico13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int num = 4;
   
        String[] vector = new String[num];
        
      //GENERLO LOS DATOS
      for(int i=0 ; i < num ;  i++){ 
          System.out.println("ingrese el nombre");
          vector[i] = leer.next();
       }   
      
      //IMPRIMO LOS DATOS
           for(int i=0 ; i < num ;  i++){ 
          System.out.println("El nombre es: " + vector[i]);
       }   
 
    }
    
}
