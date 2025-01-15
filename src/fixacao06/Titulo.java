package fixacao06;

public abstract class Titulo {
    protected String nome;
    protected double preco;
    protected double ISS;

    Titulo(String nome, double preco, double ISS){
        this.nome = nome;
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

    public double getPrecoFinal(){
        return this.preco+=getPreco()*(getISS()/100);
    }

    public String toString(){
        String detalhes;
        detalhes = "Nome: " + getNome() + ";\n Preço: " + getPreco() + ";\n";
        return detalhes;
    }
}
