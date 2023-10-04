
package ATVs;

import java.util.Random;

/**
 * @author eeuar
 */
public class ATV2 {
     public static void main(String[] args) {
         Random GER = new Random();
         int VET[] = new int [5];
         for(int x = 0; x < 5; x++){
            VET[x] = GER.nextInt(10);
         }
         int maior = VET[0];
         exibir(VET, 0, maior);
   
          
       }
      public static void exibir(int VET[], int x, int maior){
        
         if(x < VET.length){
             if (maior <= VET[x]){
                 maior = VET[x];
             }
             System.out.print(VET[x]+" ");
             exibir(VET, x + 1, maior);        
         }else{
          System.out.println("\nO maior: "+maior);
         }
           
      }
}
