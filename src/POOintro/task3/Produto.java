package POOintro.task3;

public class Produto {
    private String nome;
    private String tipo;
    private double preco;
    private int qtdEstoque;
    private float peso;

    public Produto(String nome, String tipo, double preco, int qtdEstoque, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                ", peso=" + peso +
                '}';
    }

    public String visualizar() {
        return toString();
    }
}
