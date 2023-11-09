/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author suelen.mapa
 */
public class Diretor extends Gerente {
    
    private int numDepto;
    
    public Diretor(String nome, String cpf, int senha){
        super(senha,nome, cpf);
        this.numDepto = 4;
        
    }
    
}
