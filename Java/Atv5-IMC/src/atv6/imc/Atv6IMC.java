/**
 *  O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar
 * uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
 * peso/altura^2. Desenvolva um programa que leia o peso e a altura de um adulto e mostre sua
 * condição de acordo com a tabela abaixo.
 */
package atv6.imc;

import java.util.Scanner;

/**
 * @author 0057138
 */

public class Atv6IMC {

    public static void main(String[] args) {
        float Peso, Altura, IMC;
        Scanner TEC = new Scanner(System.in);
            Peso=TEC.nextFloat();
            Altura=TEC.nextFloat();
         
                IMC = (Peso/(Altura * Altura));
                
            if(IMC >=18.5 || IMC <=24.9){
             System.out.println("Peso Normaal");
            }else if(IMC >18.5){
                 System.out.println("Abaxo dp peso");
            }else{
                System.out.println("Acima dp peso");
            }
    }
    
}
