public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numConta, String nomeTitular, double saldoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;

    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " feito com sucesso!");

    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " feito com sucesso!");

        } else {
            System.out.println("Erro! Saldo insuficiente para realizar o saque!");

        }

    }

    public double consultarSaldo() {
        return saldo;

    }

}
