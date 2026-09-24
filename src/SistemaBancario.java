import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria("Lucas Santos Mendes", "CC 2841-3");

        int opcoes;
        double deposito;
        double transferencia;

        System.out.println("****************");
        System.out.println("\nDados do Cliente:");
        System.out.println("\nNome: " + minhaConta.getTitular());
        System.out.println("Tipo de conta: " + minhaConta.getConta());
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
                minhaConta.exibirSaldo();
            } else if (opcoes == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                deposito = leitura.nextDouble();
                if(deposito <=0){
                    System.out.println("Valor inválido.");
                }   else{
                    minhaConta.depositar(deposito);
                    System.out.println("Depósito realizado.");
                    minhaConta.exibirSaldo();

                }

            } else if (opcoes == 3){
                System.out.println("Digite o valor que deseja transferir: ");
                transferencia = leitura.nextDouble();
                minhaConta.transferir(transferencia);
                minhaConta.exibirSaldo();
            }else if (opcoes == 4){
                System.out.println("Finalizando Sistema...");
            }else {
                System.out.println("Opção inválida, digite novamente.. ");

            }
            }

        }
}