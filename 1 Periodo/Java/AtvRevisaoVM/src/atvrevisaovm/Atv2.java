
package atvrevisaovm;

import java.util.Scanner;

/**
 * Faça um programa em Java que leia 10 valores inteiros e armazene-os num vetor. 
 * Depois, gere um segundo vetor que deve ser o dobro do primeiro.
 * Imprima na tela o 2° vetor.
 * @author 0057138
 */

public class Atv2 {
     public static void main(String[] args) {
         int VET[] = new int [10], VET2[] = new int[10];
         Scanner TEC = new Scanner(System.in);
         
         for (int i = 0; i < VET.length; i++) {
             VET[i] = TEC.nextInt();
             VET2[i] = VET[i]*2;
         }
         System.out.print("Vetor 2: ");
         for (int i = 0; i < VET2.length; i++) {
              System.out.print(VET2[i]+" ");
             
         }
        
     }
}
