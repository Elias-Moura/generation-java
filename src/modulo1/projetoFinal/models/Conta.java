package modulo1.projetoFinal.models;

import java.util.ArrayList;

public abstract class Conta extends ClienteABC {

    private double saldo;
    private ArrayList<Transacao> extrato = new ArrayList<>();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addOperacaoExtrato(String tipo, double valor) {
        extrato.add(new Transacao(tipo, valor));
    }

    public ArrayList<Transacao> getExtrato() {
        return extrato;
    }

    public void verExtrato() {
        System.out.println("\n- - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - Seu extrato - - - - - - -");
        for (var transacao : extrato) {
            System.out.printf("%s: R$ %,.2f\n", transacao.nome(), transacao.valor());
        }
        System.out.println("- - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - -\n");
    }
}

