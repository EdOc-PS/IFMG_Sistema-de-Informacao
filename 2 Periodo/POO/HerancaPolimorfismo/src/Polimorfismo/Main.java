/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Main {
     public static void main(String[] args) {
     Animal A = new Animal();
      Scanner tec = new Scanner(System.in);
      int esc;
      
       esc = tec.nextInt();
            switch (esc) {
                case 1:
                     Gato G = new Gato();
                     A = G;
                     A.falar();
                    break;

                case 2:
                     Cachorro C = new Cachorro();
                     A =  C;
                     C = (Cachorro) A;
                     A.falar();
                     C.morder();
                    break;
                
                case 3:
                default:
                    System.out.println("Opcao invalida");
     }
   }
}
