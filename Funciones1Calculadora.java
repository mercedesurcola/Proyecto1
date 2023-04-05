
package egg.proyecto1;

import java.util.Scanner;


public class Funciones1Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        double res = 0;
        System.out.println("Ingrese el calculo que desea");
        int calculo = leer.nextInt();
        System.out.println("calculo: " +calculo);
        
        switch (calculo){
            case 1: 
                 res = suma (num1,num2);  
                 System.out.println("El resultado es: " +res);
                 break;
            case 2: 
                 res = resta (num1,num2); 
                 System.out.println("El resultado es: " +res);
                 break;
            case 3: 
                 res = div (num1,num2);  
                 System.out.println("El resultado es: " +res);
                 break;
            case 4: 
                 res = mult (num1,num2);  
                 System.out.println("El resultado es: " +res);
                 break;
         default: 
                System.out.println("No esta definido nada para ese numero");
                break;
                
        }
        
    }
    
public static double suma(int a, int b){      
    double res = a+b;              
    return res;
}

public static double resta(int a, int b){      
    double res = a-b;              
    return res;
}

public static double div(int a, int b){      
    double res = a/b;              
    return res;
}

public static double mult(int a, int b){      
    double res = a*b;              
    return res;
}
}
