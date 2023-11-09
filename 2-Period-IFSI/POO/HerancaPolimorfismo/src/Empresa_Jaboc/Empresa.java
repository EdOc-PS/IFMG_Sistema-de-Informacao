/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empresa_Jaboc;

import java.util.Scanner;

/**
 *
 * @author 0057138
 */
public class Empresa {

    public static void main(String[] args) {
        int senhaN, esc;
        float ganho, salario;
        String nome, cpf;
        Scanner TEC = new Scanner(System.in);

        Funcionario f;
        Gerente g = new Gerente(123, "Claudio", 2000, "222333111");
        Diretor d = new Diretor(333, "Eduardo", 100000, "999999999");

        System.out.println("Informe o nome do Funcionaro: ");
        nome = TEC.next();
        System.out.println("Informe o salario do Funcionaro: ");
        salario = TEC.nextFloat();
        System.out.println("Informe o cpf do Funcionaro: ");
        cpf = TEC.next();
        f = new Funcionario(nome, salario, cpf);

        do {
            System.out.println("Bem-vindo a Jaboc \n"
                    + "1 - Verificar Funcionario\n2 - Dar aumento\n3 - Verificar salario anual \n4 - Sair");
            esc = TEC.nextInt();
            switch (esc) {
                case 1:
                    System.out.println(f.toString());
                    break;

                case 2:
                    System.out.println("Valor do aumento (Em porcentagem): ");
                    ganho = TEC.nextFloat();
                    f.aumentoSalario(ganho);
                    break;
                case 3:
                    System.out.println("O salario anual: " + f.salarioAnual());
                    break;
                case 4:
                default:
                    System.out.println("Opcao invalida");
            }
        } while (esc != 4);
        
        System.out.println("Gerente:");
        System.out.println("Eu sou: " + g.getNomeF() + "\nMinha senha: " + g.getSenhaG());

        System.out.println("\nDiretor:");
        System.out.println("O nome do diretor: " + d.getNomeF());

        boolean result = g.validarSenha(senhaN = TEC.nextInt());
        if (result) {
            System.out.println("Senhas iguais");
        } else {
            System.out.println("Acesso negado");
        }
    }

}
