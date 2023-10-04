
package ATVs;

import java.util.Scanner;

/**
 *
 * @author eeuar
 */
public class ATV3 {
    public static void main(String[] args) {
         Scanner TEC = new Scanner(System.in);
         int x, y, cont;
               
         x = TEC.nextInt();
         y = x; 
         primo(x, y, 0);
    }
    public static void primo(int x, int y,int cont){
        if(x==0 && cont == 2){
           System.out.println("é primo");
        }else if(x==0 && cont > 2){
            System.out.println("não primo");
        }
        else if(y%x==0){        
            primo(x - 1, y, cont + 1);
           
        }else{
            primo(x - 1, y, cont);
        }
    }
}
