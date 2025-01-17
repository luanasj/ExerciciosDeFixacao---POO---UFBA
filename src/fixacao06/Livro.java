package fixacao06;

public class Livro extends Titulo{

    protected final String autorPrincipal;
    protected String resumo;

    public Livro(String nome, String editora, double preco,String autorPrincipal,String resumo){
        super(nome,editora,preco,0.5);
        this.autorPrincipal = autorPrincipal;
        this.resumo = resumo;
    }

    protected Livro(String nome, String editora, double preco, double ISS ,String autorPrincipal,String resumo){
        super(nome,editora,preco,ISS);
        this.autorPrincipal = autorPrincipal;
        this.resumo = resumo;
    }

    public String getAutorPrincipal() {
        return this.autorPrincipal;
    }


    public String getResumo() {
        return this.resumo;
    }

    @Override
    public String toString() {
        String detalhes = super.toString();
        detalhes += "Autor Principal: " + getAutorPrincipal() + "\nResumo: " + getResumo();
        return detalhes;
    }


}
