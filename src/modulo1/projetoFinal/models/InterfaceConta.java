package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;

public interface InterfaceConta {
    public void sacar(double valor) throws TransacaoInvalidaException;
    public void depositar(double valor) throws TransacaoInvalidaException;
    public double getSaldo();
}
