
package atvavalarray.eduifsi;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class ATV1 {
    public static void main(String[] args) {
        int VET[] = new int [10], VET2[] = new int [10];
        Scanner TEC = new Scanner(System.in);
        int cont = 9;
    for (int i = 0; i < 10; i++) {
           VET[i] = TEC.nextInt();
           VET2[cont] = VET[i];
           cont--;
        }
        System.out.print("v1={");
      for (int i = 0; i < 9; i++) {
           System.out.print(VET[i]+",");
        }
     System.out.print(VET[9]+"}\nv2={");
     for (int i = 0; i < 9; i++) {
           System.out.print(VET2[i]+",");
        }
     System.out.print(VET2[9]+"}\n");
    }
  
}
