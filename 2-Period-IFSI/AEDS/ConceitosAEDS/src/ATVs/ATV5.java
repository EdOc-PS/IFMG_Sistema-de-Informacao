
package ATVs;

import java.util.Scanner;

/**
 * @author eeuar
 */
public class ATV5 {
     public static void main(String[] args) {
         Scanner TEC = new Scanner(System.in);
         int x, pot;
         
         System.out.println("Informe o numero");
         x = TEC.nextInt();
         System.out.println("Informe a potencia");
         pot = TEC.nextInt();
         System.out.println(potencia(x, pot));
         
     }
     public static int potencia(int x, int pot){
         if(pot > 1){
             return x * potencia(x, pot-1);
         }else{
         return x;
         }
        }
   }
  
