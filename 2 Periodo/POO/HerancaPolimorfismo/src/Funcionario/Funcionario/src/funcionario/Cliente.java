/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author 0057138
 */
public class Cliente implements Autenticar{

    private String nome;
    private int senha;
    private String depto;

    public Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
        this.depto = "Cliente";
    }
    
    @Override
    public boolean autentica(int senha) {

        System.out.println("Sou o Cliente " + this.nome
                + " e estou validando minha senha!");

        if (senha == this.senha && DeptosAutorizados.validaDepto(this.depto)) {
            System.out.println("Aprovado");
            return true;
        } else {
            System.out.println("Negado");
            return false;
        }
    }
    
}
