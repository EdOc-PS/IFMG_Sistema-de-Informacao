package poo;


import java.util.Scanner;


public class ContaMain {
   
        public static void main(String[] args){
            Conta c1;
            c1 = new Conta();
            int esc;
            Scanner TEC = new Scanner(System.in);
            
                System.out.println("- Bem-vindo - \nDigite o nome do Usuario: ");
                c1.titular = TEC.next();
                System.out.println("Digite o numero da conta: ");
                c1.numero = TEC.nextInt();
                System.out.println("Digite o valor da conta: ");
                c1.saldo = TEC.nextDouble();
         
            do{
            System.out.println("Escolha: \n 1 - Consultar saldo; \n 2 - Sacar valor; \n 3 - Depositar valor; \n 4 - sair;");
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

                    default:
                    throw new AssertionError();
                }
            }while(esc != 4);
        } 
        
}
