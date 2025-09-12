package ATVs;

import java.util.Random;


public class ATV1 {
       public static void main(String[] args) {
         Random GER = new Random();
         int VET[] = new int [5];
         for(int x = 0; x < 5; x++){
            VET[x] = GER.nextInt(5);
         }
          exibir(VET, 0);
   
          
       }
      public static void exibir(int VET[], int x){
         if(x < VET.length){
             System.out.println(VET[x]);
             exibir(VET, x + 1);
         }     
           
      }
}
