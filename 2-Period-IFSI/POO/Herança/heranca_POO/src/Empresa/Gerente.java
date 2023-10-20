/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author 0057138
 */
public class Gerente extends Funcionario{
 
    private int senhaG;
    private int qtdefuncionariosG0;

    public Gerente(int senhaG, String nomeF, float salarioF, String cpfF) {
        super(nomeF, salarioF, cpfF);
        this.senhaG = senhaG;
 
    }
    
    
    public int getSenhaG() {
        return senhaG;
    }

    public void setSenhaG(int senhaG) {
        this.senhaG = senhaG;
    }

    public int getQtdefuncionariosG0() {
        return qtdefuncionariosG0;
    }

    public void setQtdefuncionariosG0(int qtdefuncionariosG0) {
        this.qtdefuncionariosG0 = qtdefuncionariosG0;
    }
      
}
