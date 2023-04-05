package egg.proyecto1;

import java.util.Scanner;

public class Arreglos4MatrizNegativo{


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
     
        int [][] mat = new int [4][4];
        int [][] matT = new int [4][4];
    
        for (int i=0; i < 4; i++){
            for (int a=0; a < 4; a++){
            mat[i][a] = (int)(Math.random()*9+1);
            }   
        }
        //IMPRIMO
        for (int i=0; i < 4; i++){
                for (int a=0; a < 4; a++){
                System.out.print(mat[i][a]);
                }   
                System.out.println(" ");
        }
        
        System.out.println("------------------");
        
        for (int i=0; i < 4; i++){
                for (int a=0; a < 4; a++){
                    matT[a][i] = mat [i][a] ;
                }   
        }
        //IMPRIMO
         for (int i=0; i < 4; i++){
            for (int a=0; a < 4; a++){
            System.out.print(matT[i][a]);
            }   
            System.out.println(" ");
        }
                

    }
    
}
