package atv.matriz;

/*
Faça um algoritmo que construa uma matriz de nome MAT de 10 linhas e15colunas contendo números inteiros. 
Em seguida escreva a soma dos elementosde cada linha e se a soma dos elementos é par ou ímpar.
Por fimescreva a somados elementos de cada coluna e se a soma dos elementos é par ou ímpar.
*/

import java.util.Random;

public class AtvMatriz{

    public static void main(String[] args) {

        int MAT[][] = new int[10][15];;
        Random gerador = new Random();
        int SomaL = 0, cont = 1, SomaC = 0;

        for (int l = 0; l < 10; l++) {
            System.out.println();
            for (int c = 0; c < 15; c++) {
                MAT[l][c] = gerador.nextInt(10);
                System.out.print(MAT[l][c]+" ");
              
            }
        }
        
        for (int l = 0; l <10; l++) {
            System.out.println();
            for (int c = 0; c < 15; c++) {
                SomaL = MAT[l][c] + SomaL;
            }
            if(SomaL%2==0){
             System.out.print("E par e a soma da "+cont+" linha e: "+SomaL);   
            }else{
             System.out.print("E impar e a soma da "+cont+" linha e: "+SomaL);  
            }
            SomaL = 0;
            cont++;
               
        }
     
        cont = 1;
        for(int cont2 = 0; cont2 < 15; cont2++){
            System.out.println();
         for (int l = 0; l < 10; l++) {
              SomaC = MAT[l][cont2] + SomaC;  
         }    
         if(SomaC%2==0){
             System.out.print("E par e a soma da "+cont+" coluna e: "+SomaC);   
            }else{
             System.out.print("E impar e a soma da "+cont+" coluna e: "+SomaC);  
            }
            SomaC = 0;
            cont++;
        }
       
            
    
        System.out.println();
    }
}
