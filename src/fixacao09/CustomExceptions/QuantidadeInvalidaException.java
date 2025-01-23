package fixacao09.CustomExceptions;

public class QuantidadeInvalidaException extends IllegalArgumentException{
    public QuantidadeInvalidaException(){
        super("A quantidade mínima permitida é 0");
    }
}
