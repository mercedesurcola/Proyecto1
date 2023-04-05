
package egg.proyecto1;

import java.util.Scanner;

public class Arreglos2NroRandom {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese el tamaño de la matriz");
        int tam = leer.nextInt();
        System.out.println("Ponga el nro que quiere encontrar");
        int bus = leer.nextInt();
        
        
        int [] num = new int [tam];
        
        for (int i=0; i< tam; i++){
            num[i] = (int)(Math.random()*10+1);
        }
        
        
        for (int i=0; i< tam; i++){
            System.out.println(num[i]);
           
            if (num[i] == bus){
                System.out.println("Se encontró tu nro en la i: " +i);
            }
        }
    }
    
}
