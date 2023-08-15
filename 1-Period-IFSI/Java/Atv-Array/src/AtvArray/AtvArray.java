
package AtvArray;

import java.util.Scanner;

/**
 * @author 0057138
 */
public class AtvArray {

    public static void main(String[] args) {
        int cont = 0;
        int[] Array = new int [10]; 
        float media = 0;
        Scanner TEC = new Scanner(System.in);
        
           for(int N = 0; N<10; N++){   
           Array[N] = TEC.nextInt();
           media = Array[N] + media;   
           }
           media=media/10;
                
           for(int N = 0; N<10; N++){
               if(Array[N] >= media){
                   cont++;
               }
           }
           System.out.println(cont);
          
    }
}
