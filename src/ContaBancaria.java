import java.util.Scanner;

public class ContaBancaria {
   public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2500;
        int opcoes;
        double deposito;
        double transferencia;
        String nomeCliente = "Lucas Santos Mendes";
        String tipodeconta = "Corrente";

        System.out.println("****************");
        System.out.println("\nDados do Cliente:");
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipodeconta);
        System.out.println("Saldo disponivel: ****** \n");
        System.out.println("****************");

        opcoes = 0;

       while(opcoes != 4){
        System.out.println("\nOperações: ");
        System.out.println("\n1- Consultar saldo");
        System.out.println("2- Depositar valor");
        System.out.println("3- Transferir saldo");
        System.out.println("4- Sair");
        System.out.println("\nDigite a opção desejada: ");
        opcoes = leitura.nextInt();


            if (opcoes == 1) {
                System.out.println("Saldo disponivel: " + saldo);
            } else if (opcoes == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                deposito = leitura.nextDouble();
                if(deposito <=0){
                    System.out.println("Valor inválido.");
                }   else{
                    saldo += deposito;
                    System.out.println("Depósito realizado.");
                    System.out.println("Saldo atual: " + saldo);

                }

            } else if (opcoes == 3){
                System.out.println("Digite o valor que deseja transferir: ");
                transferencia = leitura.nextDouble();
                if (transferencia > saldo){
                    System.out.println("Saldo insuficiente para o valor desejado.");
                } else {
                    saldo -= transferencia;
                    System.out.println("Transferência realizada.");
                    System.out.println("Saldo atual: " + saldo);

                }
        } else if (opcoes == 4){
                System.out.println("Finalizando Sistema...");
                break;
            } else {
                System.out.println("Opção inválida, digite novamente.. ");
        }

        }
    }
}