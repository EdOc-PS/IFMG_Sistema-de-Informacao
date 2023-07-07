
package atv.matrizgeral;

import java.util.Random;

/**
 * Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas.
 * @author 0057138
 */
public class AtvMatrizII {
     public static void main(String[] args) {
       int MAT[][] = new int[4][4], MAT2[][] = new int[4][4], MAT3[][] = new int[4][4];
       Random gerador = new Random();
        for (int l = 0; l < MAT.length; l++) {
            System.out.println();
            for (int c = 0; c < MAT.length; c++) {
                MAT[l][c] = gerador.nextInt(10);
                System.out.print(MAT[l][c]+" ");
            }
        } 
        System.out.println();
        for (int l = 0; l < MAT2.length; l++) {
            System.out.println();
            for (int c = 0; c < MAT2.length; c++) {
                MAT2[l][c] = gerador.nextInt(10);
                System.out.print(MAT2[l][c]+" ");
            }
        } 
         for (int l = 0; l < MAT.length; l++) {
            for (int c = 0; c < MAT.length; c++) {
                if(MAT[l][c] > MAT2[l][c]){
                    MAT3[l][c] = MAT[l][c];
                }else{
                    MAT3[l][c] = MAT2[l][c];
                }
            }
        } 
         System.out.println();
          for (int l = 0; l < MAT3.length; l++) {
            System.out.println();
            for (int c = 0; c < MAT3.length; c++) {
                MAT[l][c] = gerador.nextInt(10);
                System.out.print(MAT3[l][c]+" ");
            }
        }
           System.out.println();
     }
}
