/**
 *  Faça um programa para ler as quatro notas escolares de um aluno e imprimir uma mensagem
 * dizendo que o aluno foi aprovado se o valor da média escolar for maior ou igual a 7,0. Se a
 * média for entre 5,0 (inclusive) e 7,0, informar que o aluno está em recuperação. Se a média
 * for inferior a 5,0 o aluno foi reprovado.
 */
package atv8.mediaaluno;

import java.util.Scanner;

/**
 * @author 0057138
 */

public class Atv8MediaAluno {

    public static void main(String[] args) {
        int NT1, NT2, NT3, NT4;
        float M;
        Scanner TEC = new Scanner(System.in);
            NT1=TEC.nextInt();
            NT2=TEC.nextInt(); 
                NT3=TEC.nextInt(); 
                NT4=TEC.nextInt(); 
          M = (NT1+NT2+NT3+NT4)/4;
            if(M>=7){
                System.out.println("Aprovado");
            }else if(M >=5){
                System.out.println("Recuperação");
            }else
                System.out.println("Reprovado");
    }
    
}
