package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.OperacaoDeDepositoInvalida;

public interface InterfaceConta {
    public double sacar(double valor);
    public void depositar(double valor) throws OperacaoDeDepositoInvalida;
    public double getSaldo();
}
