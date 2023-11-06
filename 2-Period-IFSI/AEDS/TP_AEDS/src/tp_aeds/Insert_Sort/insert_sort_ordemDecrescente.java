package tp_aeds.Insert_Sort;

import static java.lang.reflect.Array.set;
import java.util.Random;

/**
 * @author 0057138
 */
public class insert_sort_ordemDecrescente {

    public static void main(String[] args) {
        int[] vet = new int[10000];
        
        //System.out.println("Vetor não ordenado: ");
        for (int i = vet.length; i < vet.length; i--) {
            vet[i] = i;      
            //System.out.print(vet[i] + " ");
        }
       
         long tempoI = System.nanoTime();
          for (int i = 1; i < vet.length; i++) {
            int key = vet[i];
            int j = i - 1;

            while (j >= 0 && vet[j] > key) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = key;
        }

        /*System.out.println("\n\nVetor ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        */
          long tempoF = System.nanoTime() - tempoI;
        System.out.println("\nTempo: "+tempoF+"ms");
    }

}
