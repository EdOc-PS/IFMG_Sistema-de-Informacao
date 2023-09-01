
package atvs.poo;
import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class TelevisorMain {
         public static void main(String[] args){
             Televisor T;
             T = new Televisor();
             int esc;
             Scanner TEC = new Scanner(System.in);
             
            System.out.println("Ben-vindo ao televisor: \n 1 - Aumentar volume; \n 2 - Diminuir volume; \n 3 - Aumentar canal;"
                    + "\n 4 - Diminuir canal;");
            esc = TEC.nextInt();
             
              switch (esc){
                    case 1:
                      T.Aumentarvolume();
                      break;
                    case 2:             
                      T.Reduzirvolume();
                      break;
                    case 3:             
                      T.Aumentarcanal();
                      break;
                    case 4:             
                      T.Reduzircanal();
                      break;  
                      
                      
                      
                    default:
                    throw new AssertionError();
                }
             
         }
}
