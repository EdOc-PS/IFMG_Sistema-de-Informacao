/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_aeds;

import java.util.Arrays;

/**
 *
 * @author eeuar
 */
public class marge_sort_ordemDecrescente {

    public static void main(String[] args) {
        int[] vet = new int[500000];

        //System.out.println("Vetor não ordenado: ");
        for (int i = vet.length; i < vet.length; i--) {
            vet[i] = i;
            //System.out.print(vet[i] + " ");
        }
        System.out.println("");
        long tempoI = System.nanoTime();
        mergeSort(vet, 0, vet.length);

       long tempoF = System.nanoTime() - tempoI;
        System.out.println("\nTempo: " + tempoF + "ms");
    }

    private static void mergeSort(int[] vet, int inicio, int fim) {
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mergeSort(vet, inicio, meio);
            mergeSort(vet, meio, fim);
            juntar(vet, inicio, meio, fim);
        }
    }

    private static void juntar(int[] vet, int inicio, int meio, int fim) {

        int[] vetAuxiliar = new int[vet.length];
        int inicio2 = inicio, meio2 = meio, pos = 0;

        while (inicio2 < meio && meio2 < fim) {
            if (vet[inicio2] <= vet[meio2]) {
                vetAuxiliar[pos] = vet[inicio2];
                pos = pos + 1;
                inicio2 = inicio2 + 1;

            } else {
                vetAuxiliar[pos] = vet[meio2];
                pos = pos + 1;
                meio2 = meio2 + 1;
            }
        }

        while (inicio2 < meio) {
            vetAuxiliar[pos] = vet[inicio2];
            pos = pos + 1;
            inicio2 = inicio2 + 1;
        }

        while (meio2 < fim) {
            vetAuxiliar[pos] = vet[meio2];
            pos = pos + 1;
            meio2 = meio2 + 1;
        }

        for (pos = 0, inicio2 = inicio; inicio2 < fim; inicio2++, pos++) {
            vet[inicio2] = vetAuxiliar[pos];
        }
    }
}
