package fixacao06;

import java.util.LinkedList;

    public class Livraria {
    private static String nome;
    private static LinkedList<Titulo> titulos = new LinkedList<>();

    public static void setNome(String novoNome){
        nome = novoNome;
    }

    public static String getNome() {
        return nome;
    }

    public static void criarRevista(String nome, String editora, double preco, String periodicidade){
        titulos.add(new Revista(nome,editora,preco,periodicidade));
    }

    public static void criarLivroDidatico(String nome, String editora, double preco,String autorPrincipal,String resumo, String area){
        titulos.add(new LivroDidatico(nome,editora,preco,autorPrincipal,resumo,area));
    }

    public static String consultarResumoLivro(LivroDidatico livro){
        return livro.getResumo();
    }

    public static boolean temMesmaEditora(Revista revistaA, Revista revistaB){
        return revistaA.getEditora().equals(revistaB.getEditora());
    }

    public String toString(Titulo titulo){
        return titulo.toString();
    }

    public static String emitirNotaFiscal(Titulo titulo, boolean cartaoVIP){
        String notaFiscal = "NOTA FISCAL \n\n";

        double price = titulo.getPrecoFinal();

        if(cartaoVIP){
            if(titulo instanceof Livro) price += titulo.getPrecoFinal() * 0.03;
            else if(titulo instanceof Revista) price += titulo.getPrecoFinal() * 0.02;
            else if( ((Livro) titulo) instanceof LivroDidatico) price += titulo.getPrecoFinal() * 0.1;
        }

        notaFiscal += "Livraria " + Livraria.getNome() + "\n\nProdutos: \n\n 1 " + titulo.getNome() + " - " +  titulo.getPrecoFinal() + "\n\nPreço Total: " + price;

        return notaFiscal;
    }














}
