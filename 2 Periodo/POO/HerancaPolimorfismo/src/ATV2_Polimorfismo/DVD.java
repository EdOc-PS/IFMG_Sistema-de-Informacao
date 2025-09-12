/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class DVD extends Midia {

    private int nFaixas;

    public DVD(){
    }

    public DVD(int c, double p, String n, int f) {
        super(c, p, n);
        this.nFaixas = f;
    }

    public String setTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return "Nome: "+getNome()+ " Codigo: "+ Integer.toString(getCodigo())+" Preco:  "+ Double.toString(getPreco());
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    public void InserirDados() {
        setNome("FilmeX");
        setPreco(200.0);
        setCodigo(1);
    }
}
