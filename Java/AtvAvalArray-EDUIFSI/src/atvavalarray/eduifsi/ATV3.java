
package atvavalarray.eduifsi;

import java.util.Scanner;

/**
 * @author 0057138
 */
public class ATV3 {
      public static void main(String[] args) {   
         
        char VETg[] = new char[10];
        Scanner TEC = new Scanner(System.in);
        String teste = TEC.nextLine();
        int pt1 =0, pt2=0, pt3=0, med=0;
        for (int i = 0; i < 10; i++) {
               VETg[i] = teste.charAt(i);
        }
        
        char questAlunos[][] = new char[3][10];
        String sequencia; 

        for (int l = 0; l < 3; l++) {
        sequencia = TEC.nextLine();
        for (int c = 0; c < 10; c++) {
            questAlunos[l][c] = sequencia.charAt( c );
            if(VETg[c]==questAlunos[l][c]){
                if(l == 0){
                    pt1++; 
                    if(pt1>=6){
                        med++;
                    }
                }else if(l == 1){
                    pt2++;
                     if(pt2>=6){
                        med++;
                    }
                }else{
                    pt3++;
                     if(pt3>=6){
                        med++;
                    }
                }
                
            }
            
        }
        }
          System.out.println("Nota do Aluno1: "+pt1+"\nNota do Aluno2: "+pt2+
                  "\nNota do Aluno3: "+pt3+"\nNotas acima da media: "+med);
      }
      
}

