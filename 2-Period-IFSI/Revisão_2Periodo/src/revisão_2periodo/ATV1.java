/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão_2periodo;

import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {
        int num;
        Scanner TEC = new Scanner(System.in);
        num =TEC.nextInt();
        if(num <= 0){
        System.out.println("Feliz Natal! - Fica feliz :(");
        }
        else{
            System.out.print("Feliz Nat");
            for (int i = 0; i < num; i++) {
               System.out.print("a");
            }
            System.out.println("l!");
        }
    }
    
}
