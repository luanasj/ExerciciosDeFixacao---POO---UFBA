package fixacao08.Contas;

public class ContaCorrente extends Conta {
    private float taxaManutencao;
    private double limite;

    public ContaCorrente(String titular, String numConta, String agencia, double saldo, float taxaManutencao, double limite){
        super(titular, numConta, agencia, saldo);
        this.taxaManutencao = taxaManutencao;
        this.limite = limite;
    }

    public void realizarManutencaoMensal(){
        super.saldo -= super.saldo*this.taxaManutencao;
    }

    @Override
    public boolean fazerSaque(double valor) {
        if((super.saldo + this.limite - valor) >= 0){
            if(super.saldo - valor >= 0){
                super.saldo -= valor;
            } else {
                this.limite -= valor - super.saldo;
                super.saldo = 0;
            }
            return true;
        }
        return false;
    }
}
