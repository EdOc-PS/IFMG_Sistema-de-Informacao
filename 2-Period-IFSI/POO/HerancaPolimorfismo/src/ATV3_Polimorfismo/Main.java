/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV3_Polimorfismo;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Main {

    public static void main(String[] args) {
        Employee e;
        String nameE;
        double salatyE;
        Scanner tec = new Scanner(System.in);

        int esc;
        esc = tec.nextInt();
        switch (esc) {
            case 1:
                nameE = tec.next();
                salatyE = tec.nextDouble();
                Salaried s = new Salaried(nameE, salatyE);
                break;
        }
    }
}
