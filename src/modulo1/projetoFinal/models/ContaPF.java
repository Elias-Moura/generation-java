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
        addOperacaoExtrato("Primeiro depósito", primeroDeposito); // refatorar
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public void sacar(double valor) throws TransacaoInvalidaException {
        if (validaTransacao(valor)) {
            setSaldo(getSaldo()  - valor);
            var saque = String.format("%d° Saque", contadorResgates++);
            addOperacaoExtrato(saque, valor);
        } else {
            throw new TransacaoInvalidaException(valor);
        }

    }

    @Override
    public String toString() {
        return String.format(
                "\n- - ->ContaPF:\nNome completo: %s\nCPF: %s\nSaldo: R$ %,.2f"
                , nomeCompleto(), getCPF(), getSaldo()
        );
    }

    private boolean validaTransacao(double valor){
        return valor > 0;
    }
    @Override
    public void depositar(double valor) throws TransacaoInvalidaException {
        if (validaTransacao(valor)){
           setSaldo(getSaldo()  + valor);

           var deposito = String.format("%d° Depósito", contadorDeposito++);
           addOperacaoExtrato(deposito, valor);
        }
        else {
            throw new TransacaoInvalidaException(valor);
        }
    }

    @Override
    public String nomeCompleto() {
        return getNome() + " " + getSobrenome();
    }
}
