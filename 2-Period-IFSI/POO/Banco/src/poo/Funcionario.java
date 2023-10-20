
package poo;

public class Funcionario {
    private String nomef, sobrenomef;
    private double salariof;
    
    

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
    
    public void aumentoSalario(double aumento){
        if(this.salariof > 0){
        this.salariof = (this.salariof * (1 + (aumento/100)));
            System.out.println("Salario aumentado com sucesso!");
        }else{
            System.out.println("Impossivel o aumento pois o salario e 0.");
        }
    }
    
     public void ajustarFuncionario(int esc2){
        if(esc2 == 1){
                this.nomef = "Albert";
                this.sobrenomef = "Einstein";
               
           }else if(esc2 == 2){
                this.nomef = "Isaac";
                this.sobrenomef = "Newton";
           }
    }
     public void consultaFuncionario(){
        System.out.println( this.nomef+" "+this.sobrenomef+" tem o salario de: "+this.salariof);
    }
     public void salarioFuncionario(double salario){
        if(salario > 0.0){
            this.salariof = salario;
            System.out.println("Salario ajustado com sucesso!");
        }else{
            this.salariof = 0;
            System.out.println("Salario ajustado para 0.");
        }
        
   }
    
}
