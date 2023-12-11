/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repercurcividade;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Divisivel10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, cont;
        n = tec.nextInt();
        divisivel(n, 0);
    }
    public static void divisivel(int n, int cont){ 
        
        
            n = n/10;
           
            divisivel(n, cont++);
        
    }
}
