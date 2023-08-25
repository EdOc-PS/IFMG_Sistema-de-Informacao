package poo;


public class ContaMain {
   
        public static void main(String[] args){
            Conta c1;
            c1 = new Conta();
            
            c1.titular = "Eduardo";
            c1.saldo = 2500;
            c1.numero = 00001;
            
            System.out.println(" A conta: "+c1.titular+" tem o nu"
                    + "umero: "+c1.numero+" com saldo de: "+c1.saldo);
        } 
}
