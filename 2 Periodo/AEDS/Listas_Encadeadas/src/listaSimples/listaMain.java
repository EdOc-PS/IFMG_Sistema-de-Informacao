package listaencadeada;

import listaencadeada.LinkedList;
import java.util.Scanner;

/**
 *
 * @author eeuar
 */
public class listaMain {

    public static void main(String[] args) {
        LinkedList lA = new LinkedList();
        LinkedList lB = new LinkedList();
        Scanner TEC = new Scanner(System.in);
        boolean listasIguais;
        int esc;

        lA.addHead(1);
        lA.addHead(2);
        lA.addTail(4);
        lA.addTail(8);
        System.out.println("lista encadeada A:");
        lA.printLinkedList();

        lB.addHead(5);
        lB.addHead(8);
        lB.addTail(9);
        lB.addTail(18);
        System.out.println("lista encadeada B:");
        lB.printLinkedList();

        System.out.println("1 - remover elemento; 2 - Comparar listas; 3 - Unir listas");
        esc = TEC.nextInt();

        switch (esc) {
            case 1:
                System.out.println("Escolha o elemento para remover: ");
                lA.removeItem(esc = TEC.nextInt());
                System.out.println("Nova lista: ");
                lA.printLinkedList();
                break;
            case 2:
                listasIguais = lA.compareLista(lB);
                System.out.println("As listas são iguais? " + listasIguais);
                break;
            case 3:
                lA.mergeLista(lB);
                System.out.println("Nova lista:");
                lA.printLinkedList();
                break;
        }
    }
}
