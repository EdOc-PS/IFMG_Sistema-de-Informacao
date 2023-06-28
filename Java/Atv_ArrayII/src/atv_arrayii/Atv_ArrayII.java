
package atv_arrayii;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Atv_ArrayII {
    public static void main(String[] args) {
        int[] Array = new int [20];
        Scanner TEC = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
          Array[i] = TEC.nextInt();
        }
        int x = TEC.nextInt();
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] == x){
                System.out.println("O valor esta na posicao: " + i);
                System.exit(0);
            }
        }
       System.out.println("Nao foi localizado");
    }
    
}
