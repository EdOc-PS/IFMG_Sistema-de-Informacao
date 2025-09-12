/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV4_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class Moto extends Veiculos{
    private int ano;

    public Moto(String m, double p, int a) {
        super(m, p);
        this.ano = a;
    }
    
    

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     public void printDados() {
         System.out.println("Modelo: "+getModelo()+"\nPreco: "+ getPreco()+"\nAno: "+getAno());
    }

    public int getAno() {
        return ano;
    }

    
}
