/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empresa;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Heranca_POO {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("maria",1000 ,"123123123");
        Gerente g = new Gerente(123,"Claudio", 2000, "222333111");
        Diretor d = new Diretor(333,"Eduardo", 100000, "999999999");
        

        System.out.println("Gerente:");
        System.out.println("Eu sou: " + g.getNomeF()+"\nMinha senha: "+g.getSenhaG());
        
        System.out.println("\nDiretor:");
        System.out.println("O nome do diretor: "+d.getNomeF());
       
    }
    
}
