/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import empresa.Funcionario;

/**
 *
 * @author 0057138
 */
public class Secretaria extends Funcionario{
    String telefone;
    public Secretaria(String nome, String cpf, String telefone, double salario) {
        super(nome, cpf, salario);
        this.telefone = telefone;
    }
    
}
