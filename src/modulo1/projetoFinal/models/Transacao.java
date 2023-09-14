package modulo1.projetoFinal.models;

public record Transacao(String nome, Double valor) {
    @Override
    public String toString() {
        return String.format("%s: R$ %,.2f", nome, valor);
    }
}
