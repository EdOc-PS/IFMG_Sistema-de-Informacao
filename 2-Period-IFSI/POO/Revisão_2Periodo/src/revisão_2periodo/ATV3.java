
package revisão_2periodo;

import java.util.Scanner;

/**
 * @author 0057138
 */
    
public class ATV3 {
     public static void main(String[] args) {
    Scanner TEC = new Scanner(System.in);
    int Dia, Mes, DT;
        Mes = TEC.nextInt();
        Dia = TEC.nextInt();
        if(Mes == 1 && Dia  <= 31){
            DT = 360 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }
        else if(Mes == 1 && Dia  <= 31){
            DT = 360 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 2 && Dia  <= 29){
            DT = 329 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 3 && Dia  <= 31){
            DT = 298 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 4 && Dia  <= 30){
            DT = 268 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 5 && Dia  <= 31){
            DT = 237 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 6 && Dia  <= 30){
            DT = 207 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 7 && Dia  <= 31){
            DT = 176 - Dia;
            System.out.println("Faltam "+DT+" dias");
         }else if(Mes == 8 && Dia  <= 31){
            DT = 145 - Dia;
            System.out.println("Faltam "+DT+" dias");
         }else if(Mes == 9 && Dia  <= 30){
            DT = 115 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 10 && Dia  <= 31){
            DT = 84 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 11 && Dia  <= 30){
            DT = 54 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 12 && Dia  <= 23){
            DT = 31 - Dia;
            System.out.println("Faltam "+DT+" dias");
        }else if(Mes == 12 && Dia == 24){
            System.out.println("É VESPERA DE NATAL!");
        }else if(Mes == 12 && Dia == 25){
            System.out.println("FELIZ NATAL!");
        }else if(Mes == 12 && Dia > 25){
            System.out.println("JÁ PASSOU!");
        }
    }
}
