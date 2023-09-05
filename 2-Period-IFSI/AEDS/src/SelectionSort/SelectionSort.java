
package SelectionSort;

import java.util.Random;

public class SelectionSort {
     public static void main(String[] args) {
        
            int i, j, min, max;
            int VET[] = new int [4];
            Random GER = new Random();
            
            
            for (i = 0; i < VET.length; i++) {
                  VET[i] = GER.nextInt(10);
                  System.out.print(VET[i]+" ");
            }
            System.out.println("");
    }
}
