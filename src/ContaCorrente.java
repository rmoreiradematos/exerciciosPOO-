public class ContaCorrente {
    private String numeroConta;
    private String agencia;
    private double saldo;
    private String nomeTitular;
    public ContaCorrente(String numeroConta, String agencia, double saldo, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
     
}
