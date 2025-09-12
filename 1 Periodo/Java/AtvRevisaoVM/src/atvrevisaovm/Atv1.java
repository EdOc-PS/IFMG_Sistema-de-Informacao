
package atvrevisaovm;

import java.util.Scanner;

/**
 * Elabore um programa que leia valores para um vetor de 10 posições. 
 * Calcular e exibir a soma dos elementos armazenados nas posições pares
 * e nas posições impares.
 * @author 0057138
 */

public class Atv1 {
    public static void main(String[] args) {
      int VET[] = new int [10];
      int ArraySomaP = 0, ArraySomaI = 0;
        Scanner TEC = new Scanner(System.in);
        for (int i = 0; i < VET.length; i++) {
             VET[i] = TEC.nextInt();
             if(i%2 == 0){
                 ArraySomaP = VET[i] + ArraySomaP;
             }else{
                 ArraySomaI = VET[i] + ArraySomaI;
             }
        }
        System.out.println("A soma dos pares: " +ArraySomaP +
                "\nImpares: "+ArraySomaI);
    }
    
}
