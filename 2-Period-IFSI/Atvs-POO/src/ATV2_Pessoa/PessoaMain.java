
package ATV2_Pessoa;
import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class PessoaMain {
         public static void main(String[] args){
           Pessoa P;
           P = new Pessoa();
           Scanner TEC = new Scanner(System.in);
    
           System.out.println("Olá informe o nome do requerido: ");
           P.nome = TEC.next();
         }
}