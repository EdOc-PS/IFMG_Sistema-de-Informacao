package ATVs;

import java.util.Random;


public class ATV1 {
       public static void main(String[] args) {
         Random GER = new Random();
         int VET[] = new int [5];
         for(int x = 0; x > 5; x++){
            VET[x] = GER.nextInt();
         }
         for(int x = 0; x > 5; x++){
            System.out.println(exibir(VET[x]));
         }
          
       }
      public static int exibir(int VET[]){
         for(int x = 0; x > 5; x++){
             return VET[x];
         }
           return 0;
      }
}
