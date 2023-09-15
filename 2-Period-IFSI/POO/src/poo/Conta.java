
package poo;

class Conta {
    // atributos
    private int numero;
    private double saldo;
    private Cliente titular;   
    
    void getConsultaSaldo(){
        System.out.println("O saldo da Conta e: "+this.getSaldo());
    }
    
    void getSacarValor(double sacar){
        if(sacar <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - sacar);
            System.out.println("Valor sacado! - Saldo final: "+this.getSaldo());
        }else{
            System.out.println("Valor insuficiente");
        }
    }
    void setDepositar(double deposito){
        this.setSaldo(this.getSaldo() + deposito);
        System.out.println("Valor depositado! - Saldo final: "+this.getSaldo());
    }
    
    void Transferir(Conta destino, double valor){
        if(this.getSaldo() >= valor){
            destino.setSaldo(destino.getSaldo() + valor);
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Valor transferir!");
        }else{
            System.out.println("Impossivel a transferencia! ");
        }
    }
   
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
}

