package fixacao09.CustomExceptions;

public class NomeInvalidoException extends IllegalArgumentException{
    public NomeInvalidoException(){
        super("O nome do produto não pode ser vazio.");
    }
}
