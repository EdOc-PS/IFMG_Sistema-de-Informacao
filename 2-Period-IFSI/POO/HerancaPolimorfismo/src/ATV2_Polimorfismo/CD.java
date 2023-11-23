/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class CD extends Midia {

    private int nMusicas;

    public CD() {
    }

    public CD(int c, double p, String n) {
        super(c, p, n);
    }

    public String setTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return "Nome: "+getNome() + " Codigo: "+ Integer.toString(getCodigo())+" Preco: " + Double.toString(getPreco());
    }

    public void setFaixas(int m) {
        this.nMusicas = m;
    }

    public void InserirDados() {
        setNome("MusicaX");
        setPreco(150.0);
        setCodigo(2);
    }
}
