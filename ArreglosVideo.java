
package egg.proyecto1;

import java.util.Scanner;


public class ArreglosVideo {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        //int[] vector;
        int[] vector = new int[2];
        
        int[] producto = new int[3];
        
        int[][] matriz = {{4,8,6}, {2,1,7}};
        
        System.out.println("Ingrese los valores del vector" + vector.length + ":");
        
        for (int i=0; i<vector.length; i++){
            System.out.println("V[" +i+"]");
            vector[i] = leer.nextInt();
        }
        
        //MULTIPLICA vector por matriz
        int sum;
        // para cada columna de la matriz
        for (int j=0; j<matriz[0].length;j++){
            sum = 0;
            //recoro el vector y lo multiplico
            for (int i=0; i< vector.length;i++){
                sum += vector[i] * matriz[i][j];                            
            }
            producto[j] = sum;
        }
        String aux = "";
        System.out.println("* vector:");
        
        for (int elemento:vector){
        aux = aux + " " + elemento;        
    }
        System.out.println(aux);
        
    
    }
    
}
/////HOLAAAAAAAAAAAAAAAAAAAAA

///mi rama!!!!