
package atv.matrizii;

import java.util.Random;

/**
 * Faça um algoritmo que construa uma matriz 50 por 50 de números reais edepois de construída, 
 * colocar o conteúdo de sua diagonal principal dentrodeum vetor e depois do vetor montado, 
 * imprimir o vetor.
 * 
 * @author 0057138
 */

public class AtvMatrizII {

    public static void main(String[] args) {
       int MAT[][] = new int[50][50];
       Random gerador = new Random();
       int[] Array = new int [50]; 
       
        for (int l = 0; l < 50; l++) {
            System.out.println();
            for (int c = 0; c < 50; c++) {
                MAT[l][c] = gerador.nextInt(10);
                System.out.print(MAT[l][c]+" ");
            }
            Array[l] = MAT[l][l];
          
        }
        System.out.println("\n");
        for (int i = 0; i < 50; i++) {
            System.out.print(Array[i]+" ");
        }
        System.out.println();
       
        
    }
    
}
