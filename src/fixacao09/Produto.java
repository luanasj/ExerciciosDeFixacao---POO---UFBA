package fixacao09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = qtdEstoque;
    }

}
