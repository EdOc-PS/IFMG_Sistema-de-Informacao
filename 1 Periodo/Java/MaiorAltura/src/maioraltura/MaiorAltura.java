/**
 *   Faça um programa que leia o número e a altura de 5 atletas. Calcular o exibir o número e a
 *  altura do maior atleta. A entrada da altura será em centímetros.
**/
package maioraltura;

import java.util.Scanner;

public class MaiorAltura {
    public static void main(String[] args) {
        int numeroA, numeroM=0;
        float altura, alturaM=0;
        
        for(int i=1; i<=5; i++){
            Scanner TEC = new Scanner(System.in);
            numeroA = TEC.nextInt();         
            altura = TEC.nextFloat();
            
            if(altura>alturaM){
                numeroM = numeroA;
                alturaM = altura;
            }
        }
         System.out.println(numeroM+"\n"+alturaM);
    }
    
}
