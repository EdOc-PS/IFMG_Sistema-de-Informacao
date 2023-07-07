
package atv.matrizgeral;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma matriz 5 x 5. Leia também um valor X. 
 * O programa devera fazer umabusca desse valor na matriz e, ao final, 
 * escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.
 * 
 * @author 0057138
 */

public class AtvMatrizI {
    public static void main(String[] args) {
       int MAT[][] = new int[5][5];
       Random gerador = new Random();
        Scanner TEC = new Scanner(System.in);
       int X, cont=0;
       
       X = TEC.nextInt();
       
        for (int l = 0; l < 5; l++) {
            System.out.println();
            for (int c = 0; c < 5; c++) {
                MAT[l][c] = gerador.nextInt(10);
                System.out.print(MAT[l][c]+" ");
            }
          
        } 
        System.out.println();
        
        for (int l = 0; l < MAT.length; l++) {
             for (int c = 0; c < MAT.length; c++){
                 if(X == MAT[l][c]){
                     l++;
                     c++;
                     System.out.println("Valor encontado na linha: "+l+" coluna: "+c);
                 }
             }
        }
       
      
    }
    
}
