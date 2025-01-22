package fixacao08;

public class ContaPoupanca extends Conta {
    private float taxaDeRendimento;

    public ContaPoupanca(String titular, String numConta, String agencia, double saldo,float taxaDeRendimento){
        super(titular, numConta, agencia, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void realizarRendimentoMensal(){
        super.fazerDeposito(super.saldo*this.taxaDeRendimento);
    }

    @Override
    public boolean fazerSaque(double valor) {
        if((super.saldo - valor) >= 0){
            super.saldo -= valor;
            return true;
        }

        return false;
    }
}
