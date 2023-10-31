
package ATVs;

import java.util.Scanner;

/**
 * @author eeuar
 */

public class ATV4 {
       public static void main(String[] args) {
         Scanner TEC = new Scanner(System.in);
         int max, min;
         
         System.out.println("digite o minimo");
         min = TEC.nextInt();
         System.out.println("digite o maximo");
         max = TEC.nextInt();
         int VETP[] = new int[(max - min) / 2 + 1];
         int VETI[] = new int[(max - min + 1) / 2];
         
         organizacao(min, max, VETP, VETI, 0, 0);
     } 
       public static void organizacao(int min, int max, int VETP[], int VETI[], int conti, int contp){
           
           if(min <= max){
                if(min%2==0){
                    VETP[contp] = min;
                    organizacao(min + 1, max, VETP, VETI, conti, contp + 1);
                }else{
                    VETI[conti]  = min;
                    organizacao(min + 1, max, VETP, VETI, conti + 1, contp);
                }
           }else{
               System.out.print("Numeros Pares: ");
               for (int i = 0; i < contp; i++) {
                   System.out.print(VETP[i]+" ");
               }
               System.out.print("\nNumeros Impares: ");
               for (int i = 0; i < conti; i++) {
                   System.out.print(VETI[i]+" ");
               }
               System.out.println("");
           }          
       }
}
