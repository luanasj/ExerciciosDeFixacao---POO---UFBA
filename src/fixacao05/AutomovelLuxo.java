package fixacao05;

public class AutomovelLuxo extends AutomovelBasico{
    protected boolean direcaoHidraulica;
    protected boolean cambioAutomatico;
    protected boolean vidrosEletricos;

    public AutomovelLuxo(String m, String c, byte comb, boolean qm, boolean lvt, boolean multi,boolean dirHid, boolean cambioAut, boolean vidEl){
        super(m,c,comb,qm,lvt,multi);
        this.direcaoHidraulica = dirHid;
        this.cambioAutomatico = cambioAut;
        this.vidrosEletricos = vidEl;
    }

    public AutomovelLuxo(String m, String c, byte comb) {
        super(m,c,comb);
        this.direcaoHidraulica = true;
        this.cambioAutomatico = true;
        this.vidrosEletricos = true;
    }

    public boolean isDirecaoHidraulica() {
        return this.direcaoHidraulica;
    }

    public boolean isCambioAutomatico() {
        return this.cambioAutomatico;
    }

    public boolean isVidrosEletricos() {
        return this.vidrosEletricos;
    }

    public float quantoCusta(){
        float preco = super.quantoCusta();
        if (isDirecaoHidraulica())
            preco = preco + 5400;
        if (isCambioAutomatico())
            preco = preco + 7500;
        if (isVidrosEletricos())
            preco = preco + 3000;
        return preco;
    }
    public String toString(){
        String resultado = super.toString();
        if (isDirecaoHidraulica())
            resultado += "Com Direção HIdraulica \n";
        if (isCambioAutomatico())
            resultado += "Com Cambio Automático \n";
        if (isVidrosEletricos() )
            resultado += "Com VIdros Elétricos \n";
        return resultado;
    }
    
}
