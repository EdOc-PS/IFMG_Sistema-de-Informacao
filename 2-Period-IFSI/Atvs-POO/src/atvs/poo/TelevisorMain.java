
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
             int esc = 0;
             Scanner TEC = new Scanner(System.in);
            
            while(esc != 7){
                while(T.power == false){
                    System.out.println("Ben-vindo ao televisor: \n 1 - Ligar tv; \n 2 - Mostrar status;!");
                    esc = TEC.nextInt();
                     switch (esc){
                            case 1:
                              T.ligartv();
                              break;
                            case 2:             
                              T.mostrastatus();
                              break;         
                            default:
                              throw new AssertionError();
                }
                while(T.power == true){ 
                    System.out.println("Controle: \n1 - Aumentar volume; \n2 - Diminuir volume; \n3 - Aumentar canal;"
                            + "\n4 - Diminuir canal; \n5 - Mostrar Status \n6 - Desligar \n7 - Sair");
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
                            case 5:
                              T.mostrastatus();
                              break;
                            case 6:
                              T.desligartv();
                              break;
                          
                            default:
                            throw new AssertionError();
                        }
                    }
            }
           }
         }
}
         
