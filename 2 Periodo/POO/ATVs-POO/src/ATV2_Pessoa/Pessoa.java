
package ATV2_Pessoa;

public class Pessoa{
    int idade, mes, dia, ano;
    String nome;
    //calcular posteriomente o mes e ano atual com base na informação do usuario
    void calculaIdade(){
        if(mes >= 9){
           this.idade = 2023 - this.ano;
        }else{
           this.idade = (2022 - this.ano);
        }
    }
    public int informeIdade(){
        System.out.println("Idade atual: "+this.idade+"\n");
        return this.idade;
    }
    public String informeNome(){
        System.out.println("Nome: "+this.nome+"\n");
        return this.nome;
    }
    void ajustaDataDeNascimento(int esc){
        if(esc == 1){
                this.nome = "Albert Einstein";
                this.dia = 14;
                this.mes = 3;
                this.ano = 1879;  
           }else if(esc == 2){
                this.nome = "Isaac Newton";
                this.dia = 4;
                this.mes = 1;
                this.ano = 1643;  
           }
    }
}
