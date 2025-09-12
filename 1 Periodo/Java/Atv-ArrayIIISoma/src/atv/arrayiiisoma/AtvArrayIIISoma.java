
package atv.arrayiiisoma;

import java.util.Scanner;

/**
 * 
 *Elabore um programa que leia 5 valores para um vetor A. Leia mais 5 valores para o vetor B. 
 *Calcula a soma de cada elemento de A com cada elemento de B e armazene no vetor C(também de tamanho 5). 
 *Imprima na tela os 3 arrays.
 * 
 * @author 0057138
 */
public class AtvArrayIIISoma {
    public static void main(String[] args) {
        int[] ArrayA = new int [5], ArrayB = new int [5], ArrayC = new int [5];
        int a =0;
        Scanner TEC = new Scanner(System.in);
        
        for (int i = 0; i < ArrayB.length; i++) {
            while(a != 5){
            ArrayA[a] = TEC.nextInt();
            a++;
            }
            ArrayB[i] = TEC.nextInt();
        }
         for (int i = 0; i < ArrayA.length; i++) {
            ArrayC[i] =  ArrayA[i] +  ArrayB[i];
        }
         a =0;
         do{
            
             System.out.println("Vetor A: "+ArrayA[a] +"\nVetor B: "+ArrayB[a]+"\nSoma/Vetor C: "+ArrayC[a]);
             a++;
         }while(a!=5);
    }
    
}
