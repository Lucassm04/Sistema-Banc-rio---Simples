public class ContaBancaria {
    private String titular;
    private String conta;
    private double saldo;

    public ContaBancaria(String titular, String conta){
        this.titular = titular;
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public String getConta() {
        return conta;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir (double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            saldo -= valor;
            System.out.println("Transferência realizada com sucesso.");
        }
    }

    public void exibirSaldo(){
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void exibirExtrato(){
        System.out.println("=== Extrato ===");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + conta);
        exibirSaldo();
    }

}
