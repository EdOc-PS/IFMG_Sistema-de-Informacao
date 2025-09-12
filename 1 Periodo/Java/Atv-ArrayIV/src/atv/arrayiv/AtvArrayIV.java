
package atv.arrayiv;

import java.util.Scanner;

/**
 * Leia dois vetores de 20 posições e calcule um terceiro vetor contendo, nas posições pares os
 * valores do primeiro e nas posições ímpares os valores do segundo. 
 * 
 * @author 0057138
 */
public class AtvArrayIV {
    public static void main(String[] args) {
        int[] Array1 = new int [5], Array2 = new int [5], Array3 = new int [5];
        int a=0, b=0;
        Scanner TEC = new Scanner(System.in);
        
         for (int i = 0; i < Array2.length; i++) {
            while(a != 5){
                Array1[a] = TEC.nextInt();
                    a++;
            }
            while(b !=5){
                Array2[i] = TEC.nextInt();
                    b++;
            }
            if(i%2 == 0){
               Array3[i] =  Array1[i];
            }else{
               Array3[i] =  Array2[i];  
            }
         }
          a=0;
          do{
             System.out.println(Array3[a]);
             a++;
         }while(a!=5);
     } 
}
