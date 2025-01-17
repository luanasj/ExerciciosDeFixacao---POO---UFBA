package fixacao06;

public abstract class Titulo {
    protected final String nome;
    protected String editora;
    protected double preco;
    protected double ISS;

    Titulo(String nome,String editora, double preco, double ISS){
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
        this.ISS = ISS;
    }

    protected double getPreco() {
        return this.preco;
    }

    protected double getISS() {
        return this.ISS;
    }

    protected String getNome() {
        return this.nome;
    }

    public String getEditora() {
        return this.editora;
    }

    public double getPrecoFinal(){
        return this.preco+=getPreco()*(getISS()/100);
    }

    public String toString(){
        String detalhes;
        detalhes = "Nome: " + getNome() + "\n Editora: " + getEditora() +";\n Preço: " + getPreco() + ";\n";
        return detalhes;
    }
}
