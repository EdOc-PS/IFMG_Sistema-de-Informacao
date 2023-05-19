
package javateste;

import java.util.Scanner;

public class JavaTeste {

    public static void main(String[] args) {
       int soma=5, n;
       System.out.println("Ola mundo!");
       Scanner TEC = new Scanner(System.in);
       n = TEC.nextInt();
       soma=soma+5;
       while(soma>0){
       if(soma == 10){
           System.out.println("Teste\n"+soma);
       }
         soma=soma-n;
          System.out.println(soma);
        }
       System.out.println("BUM!");
    }
}
