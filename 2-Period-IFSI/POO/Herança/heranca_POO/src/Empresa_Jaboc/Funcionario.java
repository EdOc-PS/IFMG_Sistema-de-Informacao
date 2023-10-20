/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa_Jaboc;

/**
 *
 * @author 0057138
 */
public class Funcionario {
   private String nomeF;
   private float salarioF;
   private String cpfF;

   

    public Funcionario(String nomeF, float salarioF, String cpfF) {
        this.nomeF = nomeF;
        this.salarioF = salarioF;
        this.cpfF = cpfF;
    }

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
    
    public void aumentoSalario(float ganho){
        this.salarioF = this.getSalarioF() * (1 + (ganho/100));
        System.out.println("Novo salario: "+this.salarioF);
    }
    public float salarioAnual(){
        return this.salarioF * 12;
    }

     @Override
     public String toString() {
        return "Funcionario{" + "nomeF=" + nomeF + ", salarioF=" + salarioF + ", cpfF=" + cpfF + '}';
    }
   
}
