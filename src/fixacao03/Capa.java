package fixacao03;

public class Capa {
    private String cor;
    private String material;

    public Capa(String  cor,String material){
        this.cor = cor;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
