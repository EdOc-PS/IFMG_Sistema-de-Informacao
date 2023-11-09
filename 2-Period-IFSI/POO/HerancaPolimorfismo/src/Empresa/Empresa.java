/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empresa;

import Empresa_Jaboc.Gerente;
import Empresa_Jaboc.Diretor;
import Empresa_Jaboc.Funcionario;
import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Empresa {

    public static void main(String[] args) {
        int senhaN;
        Funcionario f = new Funcionario("maria",1000 ,"123123123");
        Gerente g = new Gerente(123,"Claudio", 2000, "222333111");
        Diretor d = new Diretor(333,"Eduardo", 100000, "999999999");
        
        Scanner TEC = new Scanner(System.in);

        System.out.println("Gerente:");
        System.out.println("Eu sou: " + g.getNomeF()+"\nMinha senha: "+g.getSenhaG());
        
        System.out.println("\nDiretor:");
        System.out.println("O nome do diretor: "+d.getNomeF());
      
        boolean result = g.validarSenha(senhaN = TEC.nextInt());
        if (result){
            System.out.println("Senhas iguais");
        }else{
            System.out.println("Acesso negado");
        }
    }
    
}
