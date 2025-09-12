/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author suelen
 */
public class Principal {

    public static void main(String[] args) {

        Funcionario f1 = new Secretaria("Maria", "0102");
        Gerente g = new Gerente(1234, "Joao", "0304", "Compras");
        Diretor d = new Diretor("Paula", "0706", 5678);
        Secretaria s = new Secretaria("Marta", "0943");
        Cliente c = new Cliente("Eduardo", 1313);
        ControleBonificacao cb = new ControleBonificacao();

        f1.setSalario(1500.0);
        g.setSalario(5000.0);
        d.setSalario(15000);
        s.setSalario(2000);

        /*
        System.out.println("Eu sou o(a): " + f1.getNome() + " e meu salario eh: "
                + f1.getSalario());
        System.out.println("Sou um funcionario(a) e meu bonus eh: "
                + f1.calculaBonificacao());
        cb.regitra(f1);
        
        System.out.println("Eu sou o(a): " + g.nome + " e meu salario eh: "
                + g.getSalario());
        System.out.println("Sou um gerente e meu bonus eh: "
                + g.calculaBonificacao());
        
        cb.regitra(g);

        System.out.println("Eu sou o(a) diretor(a): " + d.getNome());
        cb.regitra(d);
        
        cb.regitra(s);
*/
        SistemaInterno si = new SistemaInterno();
        //si.login(g);
        si.login(c);
        /*
        boolean resul = g.autentica(1234);

        if (resul) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }
        
        System.out.println("Total de bonificacao a ser paga pela empresa eh: "+cb.getTotalDeBonif());
*/
    }

}
