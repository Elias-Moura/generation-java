package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;

public interface InterfaceConta {
    void sacar(double valor) throws TransacaoInvalidaException;
    void depositar(double valor) throws TransacaoInvalidaException;
}
