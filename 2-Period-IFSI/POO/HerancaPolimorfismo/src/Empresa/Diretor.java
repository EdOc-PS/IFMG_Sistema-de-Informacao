/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author suelen.mapa
 */
public final class Diretor extends Gerente {
    
    private int numDepto;
    
    public Diretor(String nome, String cpf, int senha, double salario){
        super(senha, nome, cpf, salario);
        this.numDepto = 4;
        
    }
    
    @Override
    public double calculaBonificacao(){
        
        return (super.calculaBonificacao()+5000 );
        
    }
    
}
