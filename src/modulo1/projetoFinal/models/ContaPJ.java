package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.OperacaoDeDepositoInvalida;

public class ContaPJ extends ClienteABC implements InterfaceConta{

    private final String CNPJ;
    private double saldo;

    public ContaPJ(String nome, String sobrenome, String cnpj, double depositoInicial) {
        setNome(nome);
        setSobrenome(sobrenome);
        CNPJ = cnpj;
        saldo = depositoInicial;
    }

    @Override
    public String nomeCompleto() {
        return null;
    }

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public void depositar(double valor) throws OperacaoDeDepositoInvalida {

    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
