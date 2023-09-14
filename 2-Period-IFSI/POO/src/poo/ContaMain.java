package poo;


import java.util.Scanner;


public class ContaMain {
   
        public static void main(String[] args){
            //formas de declarar
            //forma 1
            Conta c1, c2;
            c1 = new Conta();
            c2 = new Conta();
            //forma 2
            Cliente cl = new Cliente();
            Cliente cl2 = new Cliente();
            int esc;
            Scanner TEC = new Scanner(System.in);
                c1.titular = cl;
                System.out.println("- Bem-vindo - \nDigite o nome do Usuario: ");
                c1.titular.nome = TEC.next();
                System.out.println("Digite o numero da conta: ");
                c1.numero = TEC.nextInt();
                System.out.println("Digite o valor da conta: ");
                c1.saldo = TEC.nextDouble();
                
                cl2.nome = "link";
                c2.saldo = 1000;
                c2.numero = 0002;
                
            do{
            System.out.println("Escolha: \n 1 - Consultar saldo; \n 2 - Sacar valor; \n 3 - Depositar valor;"
                    + "\n 4 - Transferir \n 5 - Sair;");
            esc = TEC.nextInt();
            
                switch (esc){
                    case 1:
                      c1.ConsultaSaldo();
                      break;
                    case 2:      
                       System.out.println("Quanto deseja sacar:");
                       double sacar = TEC.nextDouble();
                       c1.SacarValor(sacar); 
                       break;
                    case 3:
                       System.out.println("Quanto deseja depositar:");
                       double deposito = TEC.nextDouble();
                       c1.Depositar(deposito);
                       break;
                     case 4:
                         System.out.println("Quanto deseja transferir");
                         double valor = TEC.nextDouble();
                         c1.Transferir(c2, valor);
                        break;  
                    default:
                    throw new AssertionError();
                }
            }while(esc != 5);
        } 
        
}
