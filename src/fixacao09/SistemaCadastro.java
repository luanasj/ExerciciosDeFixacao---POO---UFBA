package fixacao09;

import fixacao09.CustomExceptions.NomeInvalidoException;
import fixacao09.CustomExceptions.PrecoInvalidoException;
import fixacao09.CustomExceptions.QuantidadeInvalidaException;

import java.util.LinkedList;

public class SistemaCadastro {
    private static LinkedList<Produto> produtos= new LinkedList<>();

    private static void verificaDadosProduto(String nome, double preco, int qtdEstoque) throws IllegalArgumentException{
        if(nome.isEmpty()){
            throw new NomeInvalidoException();
        }

        if(preco <= 0){
            throw new PrecoInvalidoException();
        }

        if(qtdEstoque < 0){
            throw new QuantidadeInvalidaException();
        }
    }

    public static String cadastrarProduto(String nome, double preco, int qtdEstoque){
        try{
            verificaDadosProduto(nome, preco, qtdEstoque);
            produtos.add(new Produto(nome, preco, qtdEstoque));
            return "Produto cadastrado com sucesso.";
        } catch (IllegalArgumentException e){
            return "Não foi possível cadastrar o produto. " + e.getMessage();
        }

    }

    private LinkedList<Produto> getProdutos(){
        return produtos;
    }
}
