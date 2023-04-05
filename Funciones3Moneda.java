
package egg.proyecto1;

import java.util.Scanner;

public class Funciones3Moneda {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);    
    int importe, moneda, resultado;
    
        System.out.println("Ingrese un importe en USD");
        importe = leer.nextInt();
        System.out.println("Ingrese una moneda");
        System.out.println("1. EUR");
        System.out.println("2. YEN");
        System.out.println("3. LIB");
       // moneda = leer.nextInt();
        
     //   resultado = conversion(importe, moneda);
        System.out.println("El cambio es de: " + conversion(importe, leer.nextInt()));
       
    }
    
    public static int conversion(int importe, int moneda){
        int res = 0;
        switch (moneda){
            case 1: 
                res = (int) (importe*0.86);
                break;
            case 2: 
                res = (int) (importe*1.28611);
                break;
            case 3: 
                res = (int) (importe*129.852);
                break;
            default :
                res = importe;
        }
        
         return res;
    }
    
}
