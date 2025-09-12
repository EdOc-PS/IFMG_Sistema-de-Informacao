/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repercurcividade;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class SequenciaFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int qtde, nAtual, nAnterior;
        qtde = tec.nextInt();
        sequencia(qtde, 1, 0);
        System.out.println("");
    }
    public static void sequencia(int qtde, int nAtual, int nAnterior){ 
        if(qtde != 0){
            System.out.print(nAtual + " ");
            nAtual = nAtual+ nAnterior; 
            sequencia(qtde - 1, nAtual,nAnterior = nAtual - nAnterior);
        }else if(qtde == 1){
            System.out.println(" 1 ");
        }
    }
}
