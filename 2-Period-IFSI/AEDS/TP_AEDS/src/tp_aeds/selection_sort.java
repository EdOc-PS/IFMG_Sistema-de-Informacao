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
public class selection_sort {

    public static void main(String[] args) {
        int[] vet = new int[100000];
        Random rdm = new Random(100);
        int menor;

        //System.out.println("Vetor não ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rdm.nextInt(100);
            //System.out.print(vet[i] + " ");
        }

        long tempoI = System.currentTimeMillis();

        for (int fixo = 0; fixo < vet.length - 1; fixo++) {
            menor = fixo;
            for (int i = menor + 1; i < vet.length; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }

            /*System.out.println("\n\nVetor ordenado: ");
                for (int i = 0; i < vet.length; i++) {
                System.out.print(vet[i] + " ");
            */}   
            
            long tempoF = System.currentTimeMillis() - tempoI;
            System.out.println("\nTempo: " + tempoF + "ms");

    }
}
