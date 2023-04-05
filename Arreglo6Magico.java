
package egg.proyecto1;

public class Arreglo6Magico {

    public static void main(String[] args) {
        int [][] hh = new int [3][3];
        int sumcol = 0;
        int sumfil = 0;
        int sumdia = 0;
        int eje = 0;

        for (int i=0; i < 3; i++){
            for (int a=0; a < 3; a++){
            hh[i][a] = (int)(Math.random()*9+1);
                //SUMO sumcol
                if (a == 0){
                    sumcol = sumcol + hh[i][a];
                  //  System.out.println("sumo "+hh[i][a]);                
                }
                //sumo fila
                if (i == 1){
                    sumfil = sumfil + hh[i][a];
                //    System.out.println("sumo  "+hh[i][a]);                
                }
               //sumo diagonal
                if (i == a){
                    sumdia = sumdia + hh[i][a];
                //    System.out.println("sumo  "+hh[i][a]);                
                }            
            }            
       }
        

        //imprimo
        for (int i=0; i < 3; i++){
            for (int a=0; a < 3; a++){
                System.out.print(hh[i][a]);
            }   
            System.out.println(" ");
        }
        /*
        System.out.println("suma columna: " +sumcol);
        System.out.println("suma fila: " +sumfil);
        System.out.println("suma diagonal: " +sumdia);
        */
        if (sumcol == sumfil &&  sumcol == sumdia ){
            System.out.println("ES MAGICA!!");
        } else {
            System.out.println("NO ES MAGICA :(");
        }
                
    }
    
   
        
        
}
