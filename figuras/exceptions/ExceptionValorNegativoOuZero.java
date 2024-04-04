package exceptions;

public class ExceptionValorNegativoOuZero extends Exception{
    public ExceptionValorNegativoOuZero() {
        super("O valor deve ser maior que 0.");
    }
}
