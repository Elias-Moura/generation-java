package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.OperacaoDeDepositoInvalida;

public class ContaPF extends Conta implements InterfaceConta {
    private final String CPF;

    public ContaPF(String nome, String sobrenome, String cpf, double primeroDeposito) {
        setNome(nome);
        setSobrenome(sobrenome);
        CPF = cpf;
        setSaldo(primeroDeposito);
        addOperacaoExtrato("Primeiro depósito", primeroDeposito);
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public double sacar(double valor) {
        addOperacaoExtrato("Saque", valor);
        return 0;
    }

    @Override
    public String toString() {
        return String.format("\n- - ->ContaPF:\nNome completo: %s\nCPF: %s\nSaldo: R$ %,.2f", nomeCompleto(), getCPF(), getSaldo());
    }

    private boolean validaDeposito(double valor){
        return valor > 0;
    }
    @Override
    public void depositar(double valor) throws OperacaoDeDepositoInvalida {
        if (validaDeposito(valor)){
           setSaldo(getSaldo()  + valor);
            addOperacaoExtrato("Deposito", valor);
        }
        else {
            throw new OperacaoDeDepositoInvalida(valor);
        }
    }

    @Override
    public String nomeCompleto() {
        return getNome() + " " + getSobrenome();
    }
}
