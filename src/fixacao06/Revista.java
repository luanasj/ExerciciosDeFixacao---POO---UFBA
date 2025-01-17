package fixacao06;

public class Revista extends Titulo{
    public String periodicidade;

    public Revista(String nome,String editora, double preco, String periodicidade){
        super(nome,editora,preco,1);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return this.periodicidade;
    }

    @Override
    public String toString() {
        String detalhes = super.toString();
        detalhes += "Periodicidade: " + getPeriodicidade() + "\n";
        return detalhes;
    }
}
