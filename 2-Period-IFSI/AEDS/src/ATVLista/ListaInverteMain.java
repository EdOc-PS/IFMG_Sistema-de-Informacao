/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATVLista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class ListaInverteMain {

    public static void main(String[] args) {
        int tam;
        Scanner TEC = new Scanner(System.in);
        Random RAN = new Random();

        tam = TEC.nextInt();

        int[] VET = new int[tam];
        for (int i = 0; i < tam; i++) {
            VET[i] = RAN.nextInt(10);
        }
        int esq = tam - (tam - 1);
    }
    private void inverter(int[] VET, int tam, int esq){
        int t;
        inverter(int[] VET, int tam - 1, int esq + 1);
    }
}
