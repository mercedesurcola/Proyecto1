
package egg.proyecto1;

import java.util.Scanner;


public class Arreglos1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int[] nro = new int[100];
        int num = 100;
        
         for(int i=0 ; i < nro.length ;  i++){ 
            nro[i] = num -i;
            System.out.println(nro[i]);
          
       } 
         
                 
        
    }
    
}
