package fixacao05;

public class DemoAutomovel {
    public static void main(String arg[]) {
        Automovel a = new Automovel("Fusca","verde", Automovel.movidoAAlcool);
        System.out.println(a.toString());
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPrestacoes());

        AutomovelBasico ab = new AutomovelBasico("Corsa","cinza", Automovel.movidoAGasolina,true,true,false);
        System.out.println(ab.toString());
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestacoes());

        AutomovelBasico abc = new AutomovelLuxo("Corsa","cinza", Automovel.movidoAGasolina,true,true,false,false,true,true);
        System.out.println(ab.toString());
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestacoes());
    }
}