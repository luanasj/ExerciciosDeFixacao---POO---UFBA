package fixacao08.Contas;

public abstract class Conta {
    protected String titular;
    protected String numConta;
    protected String agencia;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

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

    public String toString(){
        String infoConta = "Nome: " + this.getTitular() +
                "\nNº da Conta: " + this.getNumConta() +
                "\nAgência: " + this.getAgencia() + "\n";

        return infoConta;
    }
}

