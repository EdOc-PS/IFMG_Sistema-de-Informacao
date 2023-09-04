
package poo;

class Conta {
    // atributos
    int numero;
    double saldo;
    String titular;   
    
    void ConsultaSaldo(){
        System.out.println("O saldo da Conta e: "+this.saldo);
    }
    
    void SacarValor(double sacar){
        if(sacar <= this.saldo){
            this.saldo -= sacar;
            System.out.println("Valor sacado! - Saldo final: "+this.saldo);
        }else{
            System.out.println("Valor insuficiente");
        }
    }
    void Depositar(double deposito){
        this.saldo += deposito;
        System.out.println("Valor depositado! - Saldo final: "+this.saldo);
    }
    
    void Transferir(Conta destino, double valor){
        if(this.saldo >= valor){
            destino.saldo+=valor;
            this.saldo -= valor;
            System.out.println("Valor transferir!");
        }else{
            System.out.println("Impossivel a transferencia! ");
        }
    }
}

