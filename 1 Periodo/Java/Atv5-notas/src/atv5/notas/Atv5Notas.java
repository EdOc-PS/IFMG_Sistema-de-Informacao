
/**
 * Faça um programa que receba as notas AV1, AV2 e a frequência (em porcentagem) de um
* aluno. Caso a frequência seja inferior a 50% ou ambas as notas sejam inferiores a 4,0, o
* programa deve imprimir que o aluno está reprovado. Caso contrário, se apenas uma das
* notas for inferior a 4,0 ou a média AV1 e AV2 for inferior a 6,0, o programa deve imprimir
* que o aluno está de recuperação. Caso nenhuma das restrições anteriores se aplique, o
* programa deve imprimir que o aluno está aprovado e apresentar sua média
*/
package atv5.notas;

import java.util.Scanner;

public class Atv5Notas {
    public static void main(String[] args) {
       float AV1, AV2, M;

        Scanner TEC = new Scanner(System.in);
            AV1=TEC.nextFloat();
            AV2=TEC.nextFloat();
            int Freq=TEC.nextInt();
         M=(AV1+AV2)/2;
    if(Freq < 50 || (AV1 < 4.0 && AV2 < 4.0)){
        System.out.println("Reprovado");
    }else if((AV1 < 4.0 || AV2 < 4.0) || M < 6.0){
         System.out.println("Recuperação");
    }else{
        System.out.println("Aprovado com media de: "+M);
    }
    }
    
}
