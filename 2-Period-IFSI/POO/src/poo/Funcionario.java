
package poo;

public class Funcionario {
    private String nomef, sobrenomef;
    private double salariof;
    
    public void aumentoSalario(){
        this.salariof = (this.salariof + (this.salariof * 0.1));
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public String getSobrenomef() {
        return sobrenomef;
    }

    public void setSobrenomef(String sobrenomef) {
        this.sobrenomef = sobrenomef;
    }

    public double getSalariof() {
        return salariof;
    }

    public void setSalariof(double salariof) {
        this.salariof = salariof;
    }
    
    
   
    
}
