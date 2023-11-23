/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV1_Polimorfismo;


import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Main {
      public static void main(String[] args) {
      Animal a;
      Scanner tec = new Scanner(System.in);
      int esc;
      
       esc = tec.nextInt();
            switch (esc) {
                case 1:
                     Cachorro c = new Cachorro();
                     a = c;
                     c.corre();
                     a.som();
                    break;

                case 2:
                     Cavalo cav = new Cavalo();
                     a =  cav;
                     cav.corre();
                     a.som();          
                    break;
                 case 3:
                     Preguica p = new Preguica();
                     a =  p;
                     p.sobe();
                     a.som();          
                    break;
                case 4:
                default:
                    System.out.println("Opcao invalida");
     }
   }
      
}