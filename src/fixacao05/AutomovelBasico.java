package fixacao05;

public class AutomovelBasico extends Automovel {
    private boolean quintaMarcha;
    private boolean limpadorDoVidroTraseiro;
    private boolean multimidia;

    public AutomovelBasico(String m, String c, byte comb, boolean qm, boolean lvt, boolean multi){
        super(m,c,comb);
        this.quintaMarcha= qm;
        this.limpadorDoVidroTraseiro=lvt;
        this.multimidia= multi ;
    }

    public AutomovelBasico(String m, String c, byte comb) {
        super(m,c,comb);
        this.quintaMarcha = true;
        this.limpadorDoVidroTraseiro =true;;
        this.multimidia =true;
    }


    public boolean isQuintaMarcha() {
        return quintaMarcha;
    }

    public boolean isLimpadorDoVidroTraseiro() {
        return limpadorDoVidroTraseiro;
    }

    public boolean isMultimidia() {
        return multimidia;
    }

    public float quantoCusta(){
        float preco = super.quantoCusta();
        if (isQuintaMarcha())
        preco = preco + 2800;
        if (isLimpadorDoVidroTraseiro())
        preco = preco + 650;
        if (isMultimidia())
        preco = preco +3000;
        return preco;
    }
    public String toString(){
        String resultado = super.toString();
        if (isQuintaMarcha())
        resultado += "Com cinco marchas \n";
        if (isLimpadorDoVidroTraseiro())
        resultado += "Com limpador traseiro \n";
        if (isMultimidia() )
        resultado += "Com kit multmidia \n";
        return resultado;
    }
}