
package ATVs;

import java.util.Scanner;

public class TESTE {
   public static void main(String[] args) {
         Scanner TEC = new Scanner(System.in);
         int x;
               
         x = TEC.nextInt();
         System.out.println(somar(x));
         
         
        }
        public static int somar(int x){
           if(x == 1){
            return 1;
         }else{
            return (x + somar(x - 1));
             
         } 
        }           
}

