/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author suelen.mapa
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Maria", "0102");
        Gerente g = new Gerente(1234, "Joao", "0304");
        Diretor d = new Diretor("Paula", "0706", 5678);
         
        
        f1.setSalario(1500.0);
        g.setSalario(5000.0);
        
        Funcionario f2 = d;
        
        if( f2 instanceof Gerente){
        System.out.println(f2.calculaBonificacao());
        }else{
            System.out.println(" erro ");
        }
        /*
        System.out.println("Eu sou o(a): " + f1.getNome() + " e meu salario eh: "+
                f1.getSalario());
        System.out.println("Sou um funcionario(a) e meu bonus eh: "
                + f1.calculaBonificacao());
        System.out.println("Eu sou o(a): " + g.nome+ " e meu salario eh: "+
                g.getSalario());
        System.out.println("Sou um gerente e meu bonus eh: "
                + g.calculaBonificacao());
        
        System.out.println("Eu sou o(a): " + d.getNome());

        boolean resul = g.validaSenha(12345);

        if (resul) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }

        */
    }

}
