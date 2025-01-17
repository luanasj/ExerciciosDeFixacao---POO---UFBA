package fixacao06;

public class LivroDidatico extends Livro {
    private final String area;

    public LivroDidatico(String nome, String editora, double preco,String autorPrincipal,String resumo, String area){
        super(nome,editora,preco,0.5,autorPrincipal,resumo);
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        String detalhes = super.toString();
        detalhes += "Área: " + getArea();
        return detalhes;
    }
}
