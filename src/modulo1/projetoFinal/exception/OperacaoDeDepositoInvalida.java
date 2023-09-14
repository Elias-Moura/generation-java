package modulo1.projetoFinal.exception;

public class OperacaoDeDepositoInvalida extends Exception{
    public OperacaoDeDepositoInvalida() {
        super("");
    }
    public OperacaoDeDepositoInvalida(double msg, double valor) {
        super(msg + " " + valor);
    }

    public OperacaoDeDepositoInvalida(double valor) {
        super("Você não pode depositar um valor negativo: " + valor);
    }
}
