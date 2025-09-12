/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV4_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class Carro extends Veiculos {

    private double km;

    public Carro(String m, double p, double km) {
        super(m, p);
        this.km = km;
    }

    public double getPreco() {
        return 0;
    }

    public void setKmo(int km) {
        this.km = km;
    }

    public void printDados() {
        System.out.println("Modelo: " + getModelo() + "\nPreco: " + getPreco() + "\nKm: " + getKm());

    }

    public double getKm() {
        return km;
    }
}
