package fixacao03;

public class Livro {
    private String nome;
    private Capa capa;
    private Autor autor;

    public Livro(String nome,String corCapa,String materialCapa){
        this.nome = nome;
        this.capa = new Capa(corCapa,materialCapa);
        this.autor = null;
    }

    public Livro(String nome,String corCapa,String materialCapa,Autor autor){
        this.nome = nome;
        this.capa = new Capa(corCapa,materialCapa);
        this.autor = autor;
    }
}
