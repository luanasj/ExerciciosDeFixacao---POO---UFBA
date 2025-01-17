package fixacao06;

import javax.swing.*;

public class aplicacaoJava {
    public static void main(String[] args) {
        Livraria.setNome("ICON Lib");

        System.out.println("Livraria: " + Livraria.getNome());

        Livro livro1 = new Livro("Anna Karenina", "Intrinseca", 89.90, "Liev Tolstoi", "Anna Kareninna se envolve em um caso de Traição que abala as estruturas, muito divertido" );
        LivroDidatico livro2 = new LivroDidatico("Algebra Linear", "UFBA", 35.70, "Winterle","Livro que ensina algebra linear de forma bastante acessível", "Matemática");
        Revista revista1= new Revista("Superinteressante", "Abril", 22.60, "01/25");
        Revista revista2 = new Revista("Capricho","Abril",15.90,"01/25");

        Titulo[] titulos = {livro1,livro2,revista1};

        Livraria.temMesmaEditora(revista1,revista2);

        System.out.println("\n\n---- INFORMACOES TITULOS ----\n\n");

        for (Titulo titulo : titulos){
            System.out.println(titulo.toString());
        }

        System.out.println("\n\n---- NOTAS FISCAIS ----\n\n");

        for (Titulo titulo: titulos){
            System.out.println(Livraria.emitirNotaFiscal(titulo,true));
        }

    }

}
