package modulo1.projetoFinal.models;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Conta extends ClienteABC{

    private double saldo;
    private HashMap<String, Double> extrato = new HashMap<>();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addOperacaoExtrato(String tipo, double valor){
        extrato.put(tipo, valor);
    }

    public void verExtrato() {
        System.out.println("Seu extrato:");
        for (String key: extrato.keySet()) {
            for (double value: extrato.values()){
                System.out.printf("%s : R$ %,.2f",key, value);
            }
        }
        System.out.println();
    }
}
