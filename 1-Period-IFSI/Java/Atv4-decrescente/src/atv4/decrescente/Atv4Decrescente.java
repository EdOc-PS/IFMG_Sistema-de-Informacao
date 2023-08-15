/*
 * Escrever um programa que leia três números e exiba-os em ordem decrescente
 */
package atv4.decrescente;
import java.util.Scanner;

public class Atv4Decrescente {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner TEC = new Scanner(System.in);
            n1=TEC.nextInt();
            n2=TEC.nextInt();
            n3=TEC.nextInt();
            
            if(n1>n2 && n1>n3){
                if(n2>n3){
                     System.out.println(n1+"\n"+n2+"\n"+n3);
                }else{
                     System.out.println(n1+"\n"+n3+"\n"+n2);
                 }
            }
            if(n2>n1 && n2>n3){
                if(n1>n3){
                     System.out.println(n2+"\n"+n1+"\n"+n3);
                }else{
                     System.out.println(n2+"\n"+n3+"\n"+n1);
                } 
            }
            if(n3>n1 && n3>n2){
                if(n1>n2){
                     System.out.println(n3+"\n"+n1+"\n"+n2);
                }else{
                     System.out.println(n3+"\n"+n2+"\n"+n1);
                } 
           }
    }}
    
