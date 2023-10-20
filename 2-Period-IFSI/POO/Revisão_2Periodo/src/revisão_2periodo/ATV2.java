
package revisão_2periodo;

import java.util.Scanner;

public class ATV2 {
     public static void main(String[] args) {
         int X, Y;
         Scanner TEC = new Scanner(System.in);
         X = TEC.nextInt();
         Y = TEC.nextInt();
         
         while(X != 0 && Y != 0){
              System.out.println("Nulo");
         }if(X > 0){
             if(Y > 0){
                 System.out.println("Primeiro Quadrante");
             }else{
                System.out.println("Quarto Quadrante"); 
             }
        }else{
             if(Y > 0){
                System.out.println("Segundo Quadrante");  
             }else{
                System.out.println("Terceiro Quadrante"); 
             }
         }
     }
}
