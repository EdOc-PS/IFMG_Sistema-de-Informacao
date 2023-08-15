/**
    *  Faça um programa que leia um número e some 5 caso seja par e divisível por 5 ou some 8
    * caso seja ímpar. Imprimir o resultado desta operação. 
 */
package avt7.divisivelpor8;

import java.util.Scanner;

/**
 * @author 0057138
 */

public class Avt7Divisivelpor8 {
    
    public static void main(String[] args) {
        
           Scanner TEC = new Scanner(System.in);
            int N1 = TEC.nextInt();
            
          if(N1%2==0 && N1%5==0){
              N1 = N1+5;
              System.out.println(N1);
          }else{
              N1 = N1+8;
              System.out.println(N1);
          }
           
    }
    
}
