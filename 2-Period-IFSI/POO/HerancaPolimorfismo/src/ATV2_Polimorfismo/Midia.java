/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class Midia {

    private int codigo;
    private double preco;
    private String nome;
    
    public Midia(){
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "";
    }
    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String setTipo() {
        return null;
       
    }

    public String getDetalhes() {
        return null;
    }

   public void printDados(){
         System.out.println("Tipo: "+ setTipo() +"\nDetalhes: "+getDetalhes());
     }

    public void InserirDados() {
    }
}
