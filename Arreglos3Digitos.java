
package egg.proyecto1;

import java.util.Scanner;


public class Arreglos3Digitos {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingerse el tamaño de vector");
        int vec = leer.nextInt();
        
        int [] a = new int [vec];
        
        for (int i=0; i< vec; i++){
          a[i] = (int)(Math.random()*10000+1);
          if (a[i]/10 <10){
              System.out.println("El numero " +a[i]+ " tiene 2 digitos");
              
          } else if (a[i]/100 <10){
              System.out.println("El numero " +a[i]+ " tiene 3 digitos");
                } else if (a[i]/1000 <10){
                System.out.println("El numero " +a[i]+ " tiene 4 digitos");
                } else if (a[i]/10000 <10){
                System.out.println("El numero " +a[i]+ " tiene 5 digitos");
                }else if (a[i] <10){
                System.out.println("El numero " +a[i]+ " tiene 1 digito");
                }
          }
          
          
        }
        
    }
   
