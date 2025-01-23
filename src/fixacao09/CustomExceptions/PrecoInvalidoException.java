package fixacao09.CustomExceptions;

public class PrecoInvalidoException extends IllegalArgumentException{
    public PrecoInvalidoException(){
        super("O preço do produto deve ser maior que zero.");
    }
}
