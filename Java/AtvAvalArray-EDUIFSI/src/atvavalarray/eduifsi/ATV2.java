
package atvavalarray.eduifsi;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class ATV2 {
     public static void main(String[] args) {   
         int MAT[][] = new int[4][4];
         Scanner TEC = new Scanner(System.in);
         int soma=0,cont=3;
           for (int l = 0; l < MAT.length; l++) {
             for (int c = 0; c < MAT.length; c++){
                MAT[l][c] = TEC.nextInt(10);
               
             }
              soma=MAT[l][cont]+ soma;
              cont--;
         }
           
          System.out.println(soma);
     }
 }
   