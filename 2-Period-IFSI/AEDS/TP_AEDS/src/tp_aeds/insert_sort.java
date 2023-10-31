package tp_aeds;

import java.util.Random;

/**
 * @author 0057138
 */
public class insert_sort {

    public static void main(String[] args) {
        int[] vet = new int[10000000];
        Random rdm = new Random();
     
        //System.out.println("Vetor não ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rdm.nextInt(100);
           //System.out.print(vet[i] + " ");
        }
       
        long tempoI = System.currentTimeMillis();
        insert_sort is = new insert_sort();
        is.ordenar(vet);

        /*System.out.println("\n\nVetor ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        */
        long tempoF= System.currentTimeMillis() - tempoI;
        System.out.println("\nTempo: "+tempoF+"ms");
    }

    public void ordenar(int[] vet) {
        for (int i = 1; i < vet.length; ++i) {
            int key = vet[i];
            int j = i - 1;

            while (j >= 0 && vet[j] > key) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = key;
        }
    }
}
