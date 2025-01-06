package fixacao05;

public class Automovel {
    
    public static final int movidoAGasolina = 1;
    public static final int movidoAAlcool = 2;
    public static final int movidoADiesel = 3;
    private static final int numeroMaximoDePrestacoes = 24;

    private String modelo;
    private String cor;
    private int combustivel;

    public Automovel(String modelo, String cor, int combustivel) {
        this.modelo = modelo;
        this.cor= cor;
        this.combustivel = combustivel;
    }

    public int quantasPrestacoes() {
        return numeroMaximoDePrestacoes;
    }

    public int getCombustivel(){
        return this.combustivel;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public float quantoCusta() {
        float preco = 0;
        switch (getCombustivel()){
            case movidoAGasolina: preco = 12000; break;
            case movidoAAlcool: preco = 10500; break;
            case movidoADiesel: preco = 11000; ;
        }
        return preco;
    }



    public String toString(){
        String resultado;
        resultado = getModelo()+" "+getCor()+"\n";
        switch(getCombustivel()) {
            case movidoAGasolina: resultado += "Gasolina \n"; break;
            case movidoAAlcool: resultado += "Álcool \n"; break;
            case movidoADiesel: resultado += "Diesel \n"; break;
        }
        return resultado;
    }
}