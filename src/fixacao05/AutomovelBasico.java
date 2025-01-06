package fixacao05;

public class AutomovelBasico extends Automovel {
    private boolean quinta Marcha;
    private boolean limpadorDoVidroTraseiro;
    private boolean multmidia;

    public AutomovelBasico (String m, String c, byte comb, boolean qm, boolean lvt, boolean m){
        super(m,c,comb);
        this.quintaMarcha= qm;
        this.limpadorVidroTraseiro=lvt;
        this.multmidia= m ;
    }

    public AutomovelBasico (String m, String c, byte comb) {
        super(m,c,comb);
        this.quintaMarcha = true;
        this.limpadorVidroTraseiro =true;;
        this.multmidia =true;
    }

    public float quantoCusta(){
        float preco = super.quantoCusta();
        if (getQuintaMarcha())
        preco = preco + 2800;
        if (getLimpadorDoVidroTraseiro())
        preco = preco + 650;
        if (getMultimidia() )
        preco = preco +3000;
        return preco;
    }
    public String toString(){
        String resultado = super.toString();
        if (getQuintaMarcha() == true)
        resultado += "Com cinco marchas \n";
        if (getLimpadorDoVidroTraseiro() == true)
        resultado += "Com limpador traseiro \n";
        if (getMultimida() == true)
        resultado += "Com \kit multmidia \n";
        return resultado;
    }
}