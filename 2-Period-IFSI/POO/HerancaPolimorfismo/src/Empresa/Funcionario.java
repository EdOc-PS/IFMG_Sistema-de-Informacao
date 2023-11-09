/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author 0057138
 */
public class Funcionario {
   protected String nomeF;
   protected float salarioF;
   protected String cpfF;

   
/*
    public Funcionario(String nomeF, float salarioF, String cpfF) {
        this.nomeF = nomeF;
        this.salarioF = 0;
        this.cpfF = cpfF;
    }
*/
   
   

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public float getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(float salarioF) {
        this.salarioF = salarioF;
    }

    public String getCpfF() {
        return cpfF;
    }

    public void setCpfF(String cpfF) {
        this.cpfF = cpfF;
    }
     @Override
     public String toString() {
        return "Funcionario{" + "nomeF=" + nomeF + ", salarioF=" + salarioF + ", cpfF=" + cpfF + '}';
    }
   
}
