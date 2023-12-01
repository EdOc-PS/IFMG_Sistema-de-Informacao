/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author suelen
 */
public class SistemaInterno {
    
    Scanner teclado = new Scanner(System.in);
    
    public void login (Autenticar fun){
        
        System.out.println("Informe sua senha: ");
        int senha = teclado.nextInt();
        
        fun.autentica(senha);
        
    }
    
    
   /* public void login (Diretor dir){
        
        System.out.println("Informe sua senha: ");
        int senha = teclado.nextInt();
        
        dir.autentica(senha);
        
    }
    
    public void login (Gerente dir){
        
        System.out.println("Informe sua senha: ");
        int senha = teclado.nextInt();
        
        dir.autentica(senha);
        
    }*/
    
    
    
    
}
