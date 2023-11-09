/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Empresa_Jaboc.Funcionario;

/**
 *
 * @author 0057138
 */
public class Gerente extends Funcionario{
 
    private int senhaG;
    private int qtdefuncionariosG;

    public Gerente(int senhaG, String nomeF, float salarioF, String cpfF) {
        super(nomeF, salarioF, cpfF);
        this.senhaG = senhaG;
 
    }
    public boolean validarSenha(int senhaG){
        System.out.println("Validação de senha do gerente "+this.getNomeF());
        return senhaG == this.senhaG;
    }
    
    
    public int getSenhaG() {
        return senhaG;
    }

    public void setSenhaG(int senhaG) {
        this.senhaG = senhaG;
    }

    public int getQtdefuncionariosG0() {
        return qtdefuncionariosG;
    }

    public void setQtdefuncionariosG0(int qtdefuncionariosG0) {
        this.qtdefuncionariosG = qtdefuncionariosG0;
    }
      
}
