
package ATV2_Pessoa;
import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class PessoaMain {
         public static void main(String[] args){
           Pessoa P1;
           
           P1 = new Pessoa();    
           Scanner TEC = new Scanner(System.in);
         
           System.out.println("Selecione:\n1-Albert Einstein;\n2-Isaac Newton;");
           int esc = TEC.nextInt();
           P1.ajustaDataDeNascimento(esc);
           P1.calculaIdade();
           
           do{
               System.out.println("Confira:\n1-Confira Idade;\n2-Confira Nome;\n3-Sair;");
               esc = TEC.nextInt();
               switch (esc){
                    case 1:
                    P1.informeIdade();
                      break;
                    case 2:      
                    P1.informeNome();
                      break;
                    case 3:
                       System.exit(0);
                       break;          
                    default:
                    throw new AssertionError();
                }
           }while(esc !=3);
           
         }
}