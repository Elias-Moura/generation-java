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

    protected void addOperacaoExtrato(String tipo, double valor) {
        extrato.add(new Transacao(tipo, valor));
    }

    public ArrayList<Transacao> getExtrato() {
        return extrato;
    }

    protected boolean validaSaldoSuficiente(double valor) {
        return valor <= saldo;
    }
    protected boolean validaTransacao(double valor){
        return valor >= 0;
    }
}

