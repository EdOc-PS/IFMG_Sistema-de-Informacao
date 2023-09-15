
package poo;

public class Cliente {
    private int cpf;
    private int tel; 
    private String end;
    private String nome;
    
    public void Consulta(){
        System.out.println(this.getNome()+": \nCPF: "+this.getCpf()+"\nTELEFONE: "+this.getTel()
                +"\nENDERECO: "+this.getEnd());
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
