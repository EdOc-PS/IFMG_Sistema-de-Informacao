/*
 * Fazer um programa que leia a sigla do estado de uma pessoa e imprima uma das mensagens
 *  abaixo de acordo com estado informado:
 */
package nacionalidadde;

import java.util.Scanner;

public class Nacionalidadde {

    public static void main(String[] args) {
     Scanner TEC = new Scanner(System.in);
     String nac = TEC.next();
     switch (nac){
         case "MG":
         System.out.println("mineiro");
         break;
                case "RJ":
                System.out.println("carioca");
                break;
                    case "SP":
                    System.out.println("paulista");
                    break;
         case "RN":  
         System.out.println("potigua");
         break;
              case "ES":
              System.out.println(" capixaba");
              break;
                   case "RS":
                   System.out.println("gaucho");
                   break;
          case "SC":
          System.out.println("gaucho");
          break;
          
          default:
          System.out.println("outro estado");
     }
    }
    
}
