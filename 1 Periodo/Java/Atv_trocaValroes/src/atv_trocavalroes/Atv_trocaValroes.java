
package atv_trocavalroes;

import java.util.Scanner;

/**
 * Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.
 * 
 * @author 0057138
 */

public class Atv_trocaValroes {
    public static void main(String[] args) {
        int[] Array = new int [16];
        int cont = 17;
        Scanner TEC = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
          Array[i] = TEC.nextInt();
        }
   
        for (int i = 0; i < 9; i++) {
           cont--;
           Array[i] = Array[cont];   
          }
        for (int i = 9; i < 17; i++) {
           cont--;
           Array[cont] = Array[i];   
          }
        
            System.out.println(Array[16]);
        
    }
}

    

