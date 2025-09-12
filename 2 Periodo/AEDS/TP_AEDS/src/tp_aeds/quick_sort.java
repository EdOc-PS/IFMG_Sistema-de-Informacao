/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_aeds;

import java.util.Random;

/**
 *
 * @author eeuar
 */
public class quick_sort {

    public static void main(String[] args) {
        int[] vet = new int[1000000];
        Random rdm = new Random();
        int n = vet.length - 1;
        //System.out.println("Vetor não ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rdm.nextInt(100);
            //System.out.print(vet[i] + " ");
        }
        System.out.println("");
        long tempoI = System.currentTimeMillis();
        quickSort(vet, 0, n - 1);

        long tempoF = System.currentTimeMillis() - tempoI;
        System.out.println("\nTempo: " + tempoF + "ms");
       
    }

    public static void quickSort(int[] vet, int esq, int dir) {
        if (esq < dir) {
            int p = part(vet, esq, dir);
            quickSort(vet, esq, p);
            quickSort(vet, p + 1, dir);
        }
    }

    public static int part(int[] vet, int esq, int dir) {
        int meio = (int) (esq + dir) / 2;
        int pivo = vet[meio];
        int i = esq - 1;
        int j = dir + 1;
        int aux;

        while (true) {
            do {
                i++;
            } while (vet[i] > pivo);
            do {
                j--;
            } while (vet[j] < pivo);
            if (i >= j) {
                return j;
            }
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
    }
}
