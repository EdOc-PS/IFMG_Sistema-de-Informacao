package ATV2_Polimorfismo;

import java.util.Scanner;

/**
 * @author 0057138
 */
public class Main {

    public static void main(String[] args) {
        Midia m;
        Scanner tec = new Scanner(System.in);
        int esc;
        esc = tec.nextInt();
        switch (esc) {
            case 1:
                DVD dvd = new DVD();
                m = dvd;
                m.InserirDados();
                m.printDados();
                break;
            case 2:
                CD cd = new CD();
                m = cd;
                m.InserirDados();
                m.printDados();
                break;
        }
    }
}
