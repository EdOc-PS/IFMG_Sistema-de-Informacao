/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_aeds;

import java.util.Random;

/**
 *
 * @author eeuar
 *
 */
public class bubble_sort_ordemDecrescente {

    public static void main(String[] args) {
        int[] vet = new int[100000];

        int cont;

        //System.out.println("Vetor não ordenado: ");
        for (int i = vet.length; i < vet.length; i--) {
            vet[i] = i;
            //System.out.print(vet[i] + " ");
        }
        long tempoI = System.nanoTime();

        for (int ord = vet.length - 1; ord < vet.length; ord--) {
            for (int e = 0; e < ord; e++) {
                if (vet[e] > vet[e + 1]) {
                    cont = vet[e];
                    vet[e] = vet[e + 1];
                    vet[e + 1] = cont;
                }
            }
        }
        /*System.out.println("\n\nVetor ordenado: ");
                for (int i = 0; i < vet.length; i++) {
                System.out.print(vet[i] + " ");
        }
         */
        long tempoF = System.nanoTime() - tempoI;
        System.out.println("\nTempo: " + tempoF + "ms");
    }
}
