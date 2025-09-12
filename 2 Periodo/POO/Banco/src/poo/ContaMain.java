package poo;

import java.util.Scanner;

public class ContaMain {

    public static void main(String[] args) {
        //formas de declarar
        //forma 1
        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();
        //forma 2
        Cliente cl = new Cliente();
        Cliente cl2 = new Cliente();
        Funcionario F = new Funcionario();
        
        int esc, esc2;
        Scanner TEC = new Scanner(System.in);
            
        do{
            System.out.println("- Banco DODOCAS -\n1 - Cadastrar Usuario; \n2 = Consultar Funcionarios;");
            esc = TEC.nextInt();
                if(esc != 1){
                do{
                System.out.println("-- ! Area privada ! --\nEscolha o funcionario: \n1 - Albert Einstein; \n2 - Isaac Newton; \n3 - Sair ");
                esc2 = TEC.nextInt();
                if(esc2 <= 2){
                    F.ajustarFuncionario(esc2);
                    do{
                        System.out.println("-- ! Area privada ! --\nEditar dados: \n1 - Consultar dados; \n2 - Dar salario; \n3 - Dar aumento; \n4 - Sair;");
                        esc2 = TEC.nextInt();
                        switch (esc2) {
                            case 1:
                                F.consultaFuncionario();
                                break;
                            case 2:
                                System.out.println("Valor do salario:");
                                double salario = TEC.nextDouble();
                                F.salarioFuncionario(salario);
                                break;
                            case 3:
                                System.out.println("Valor do aumento:");
                                double aumento = TEC.nextDouble();
                                F.aumentoSalario(aumento);
                                break;
                            case 4:
                                System.out.println("Saindo...");
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }while(esc2 != 4); 
                }
              }while(esc2 != 3);
                }}while(esc != 1);
        
            c1.setTitular(cl);
            System.out.println("--- Banco --- \nCadastre o nome do Usuario: ");
            c1.getTitular().setNome(TEC.next());
            System.out.println("Cadastre o CPF: ");
            c1.getTitular().setCpf(TEC.nextInt());
            System.out.println("Cadastre o telefone: ");
            c1.getTitular().setTel(TEC.nextInt());
            System.out.println("Cadastre o Endereco: ");
            c1.getTitular().setEnd(TEC.next());
            System.out.println("Digite o numero da conta: ");
            c1.setNumero(TEC.nextInt());
            System.out.println("Digite o valor da conta: ");
            c1.setSaldo(TEC.nextDouble());

            cl2.setNome("link");
            c2.setSaldo(1000);
            c2.setNumero(0002);

        do {
            System.out.println("\nEscolha:\n---------------------------\n 1 - Consultar saldo; \n 2 - Sacar valor; \n 3 - Depositar valor;"
                    + "\n 4 - Transferir \n 5 - Consultar dados;\n 6 - Sair; \n---------------------------");
            esc = TEC.nextInt();
            switch (esc) {
                case 1:
                    c1.getConsultaSaldo();
                    break;
                case 2:
                    System.out.println("Quanto deseja sacar:");
                    double sacar = TEC.nextDouble();
                    c1.getSacarValor(sacar);
                    break;
                case 3:
                    System.out.println("Quanto deseja depositar:");
                    double deposito = TEC.nextDouble();
                    c1.setDepositar(deposito);
                    break;
                case 4:
                    System.out.println("Quanto deseja transferir");
                    double valor = TEC.nextDouble();
                    c1.Transferir(c2, valor);
                    break;
                case 5:
                    cl.Consulta();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (esc != 6);
    }

}
