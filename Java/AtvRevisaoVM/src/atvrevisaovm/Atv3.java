
package atvrevisaovm;

import java.util.Random;


/**
 * Faça um programa que leia uma matriz de números inteiros de dimensões 4x5 e imprima a
 * soma dos valores de cada linha e a soma de todos os elementos da matriz.
 * @author 0057138
 */
public class Atv3 {
      public static void main(String[] args) {
          Random GER = new Random();
          int MAT[][] = new int[5][4];
          int VET[] = new int [5];
          int MatSoma = 0;
          
          for (int l = 0; l < 5; l++) {
              System.out.println();
              for (int c = 0;  c < 4; c++) {
                  MAT[l][c] = GER.nextInt(2);
                  System.out.print(MAT[l][c] + " ");      
                  MatSoma = MAT[l][c] + MatSoma;     
                  VET[l]= MAT[c][l] + VET[l];       
              }
            
 ;    
          }
          System.out.println("\n--------");
           for (int i = 0; i < 5; i++) {
               System.out.print(VET[i]+" ");
              
          }
           System.out.println("\n"+MatSoma);
      }
}
