package fixacao03;

import java.util.LinkedList;

public class Autor {
    private String nome;
    private String CPF;
    private LinkedList<Livro> livros;

    public Autor(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.livros = new LinkedList<Livro>();
    }

    public Autor(String nome, String CPF,Livro livro){
        this.nome = nome;
        this.CPF = CPF;
        this.livros = new LinkedList<>();
        this.livros.add(livro);
    }



    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Livro livro) {
        this.livros.add(livro);
    }


}


