
package Fatorial;

import java.util.Scanner;

public class Fatorial {
    
        public static void main(String[] args){
                Scanner TEC = new Scanner(System.in);
                int fatorial = 1, fat = 2, n;

                System.out.println("Digite o numero a ser fatoraido");
                n = TEC.nextInt();
                
                 while(fat <= n){
                   fatorial = fatorial * fat; 
                   fat = fat + 1;
                }
                System.out.println(fatorial);
   }
}
