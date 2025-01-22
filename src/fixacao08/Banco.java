package fixacao08;

import fixacao08.Contas.Conta;
import fixacao08.Contas.ContaCorrente;
import fixacao08.Contas.ContaPoupanca;

import java.util.HashMap;
import java.util.LinkedList;

public class Banco {
    private final LinkedList<String> maiorQue500 = new LinkedList<>();
    private final HashMap<String,Conta> contasDoBanco = new HashMap<>();

    public void guardarSaqueMaiorQue500(Conta conta, double valor){
        String saqueInfo = conta.toString();

        saqueInfo += "Valor do Saque: " + valor +"\n";

        this.maiorQue500.add(saqueInfo);
    }

    public void criarConta(String titular, String numConta, String agencia, double saldo, float taxaManutencao, double limite){
        this.contasDoBanco.put(numConta,new ContaCorrente(titular, numConta, agencia, saldo, taxaManutencao, limite));
    }

    public void criarConta(String titular, String numConta, String agencia, double saldo,float taxaDeRendimento){
        this.contasDoBanco.put(numConta,new ContaPoupanca(titular, numConta, agencia, saldo, taxaDeRendimento));
    }

    public void removerConta(String numConta){
        this.contasDoBanco.remove(numConta);
    }

    public boolean realizarSaque(Conta conta, double valor){
        return conta.fazerSaque(valor);
    }

    public void realizarDeposito(Conta conta, double valor){
        conta.fazerDeposito(valor);
    }

}
