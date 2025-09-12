/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV4_Polimorfismo;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Main {

    public static void main(String[] args) {
        Veiculos v;
        String modeloV;
        double precoV;
        Scanner tec = new Scanner(System.in);

        int esc;
        System.out.println("Escolha: \n1 - Moto\n2 - Carro");
        esc = tec.nextInt();
      
        switch (esc) {
            case 1:
                modeloV = tec.next();
                precoV = tec.nextDouble();
                int anoV = tec.nextInt();
                Moto m = new Moto(modeloV, precoV, anoV);
                v = m;
                v.printDados();
                break;
            case 2:
                modeloV = tec.next();
                precoV = tec.nextDouble();
                double km = tec.nextDouble();
                Carro c = new Carro(modeloV, precoV, km);
                v = c;
                v.printDados();
                break;
        }
    }
}
