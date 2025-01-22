package fixacao08;

public abstract class Conta {
    protected String titular;
    protected String numConta;
    protected String agencia;
    protected double saldo;

    public Conta(String titular, String numConta, String agencia, double saldo){
        this.titular = titular;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void fazerDeposito(double valor){
        this.saldo += valor;
    }

    public abstract boolean fazerSaque(double valor);
}
