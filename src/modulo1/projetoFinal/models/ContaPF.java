package modulo1.projetoFinal.models;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;

public class ContaPF extends Conta implements InterfaceConta {
    private final String CPF;
    private int contadorDeposito = 1;
    private int contadorResgates = 1;

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
    public void sacar(double valor) throws TransacaoInvalidaException {
        var trasacaoValida = validaTransacao(valor);
        var saldoSuficiente = validaSaldoSuficiente(valor);
        if (trasacaoValida && saldoSuficiente) {
            setSaldo(getSaldo() - valor);
            var saque = String.format("%d° Saque", contadorResgates++);
            addOperacaoExtrato(saque, valor);
        } else {
            if (!trasacaoValida) {
                throw new TransacaoInvalidaException("Você não pode realizar transações com valor negativo", valor);
            } else {
                var msg = String.format("Saldo insuficiente. Seu saldo é R$ %,.2f e você tentou sacar", getSaldo());
                throw new TransacaoInvalidaException(msg, valor);
            }
        }
    }
    @Override
    public String toString() {
        return String.format(
                "\n- - ->ContaPF:\nNome completo: %s\nCPF: %s\nSaldo: R$ %,.2f"
                , nomeCompleto(), getCPF(), getSaldo()
        );
    }
    @Override
    public void depositar(double valor) throws TransacaoInvalidaException {
        if (validaTransacao(valor)) {
            setSaldo(getSaldo() + valor);

            var deposito = String.format("%d° Depósito", contadorDeposito++);
            addOperacaoExtrato(deposito, valor);
        } else {
            throw new TransacaoInvalidaException(valor);
        }
    }
}
