package modulo1.projetoFinal.exception;

public class TransacaoInvalidaException extends Exception{
    public TransacaoInvalidaException() {
        super("");
    }
    public TransacaoInvalidaException(double msg, double valor) {
        super(msg + " " + valor);
    }

    public TransacaoInvalidaException(double valor) {
        super("Você não pode realizar transações com um valor negativo: " + valor);
    }
}
