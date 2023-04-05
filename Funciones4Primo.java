
package egg.proyecto1;

import java.util.Scanner;

public class Funciones4Primo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("Ingrese un número");
        int nro = leer.nextInt();
        double prim = 0;
        String result;
        result = "NO PRIMO";
        
        prim = primo(nro);
        
        if (prim ==0 ){
            result = "PRIMO";
        } 
        
        System.out.println("el numero es: " +result);
        
    }
    
        public static double primo(int nro){
        double res;
        res = 0;
        int prim = 0;
        
        for(int i=2 ; i <10 ;  i++){
                       
            if (nro%i == 0 && nro != i ){
                prim = prim+1;
            }
            // res = (nro%i);
           // System.out.println(" nro /" +i + " es igual a: " +(nro%i) + "primo: "+ prim);
            
        }
           // System.out.println("resultado:" +res);

         return prim;
    }
}
