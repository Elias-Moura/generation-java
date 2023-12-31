package modulo1.projetoFinal.exception;

public class TransacaoInvalidaException extends Exception{

    public TransacaoInvalidaException(String mensagem, double valor) {
        super(mensagem + ": " + String.format("R$ %,.2f", valor));
    }
    public TransacaoInvalidaException(double valor) {
        super("Você não pode transferir um valor negativo: " + valor);
    }
}
