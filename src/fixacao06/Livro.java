package fixacao06;

public class Livro extends Titulo{
    protected String autorPrincipal;
    protected String editora;
    protected String resumo;

    public Livro(String nome, double preco,String autorPrincipal,String editora,String resumo){
        super(nome,preco,0.5);
        this.autorPrincipal = autorPrincipal;
        this.editora = editora;
        this.resumo = resumo;
    }


}
