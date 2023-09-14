package modulo1.POOintro.task4;

public class Farmacia {

    private String nome;
    private String endereco;
    private int estoqueMedicamentos;
    private int qtdeFuncionarios;
    private int qtdeVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEstoqueMedicamentos() {
        return estoqueMedicamentos;
    }

    public void setEstoqueMedicamentos(int estoqueMedicamentos) {
        this.estoqueMedicamentos = estoqueMedicamentos;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public int getQtdeVendas() {
        return qtdeVendas;
    }

    public void setQtdeVendas(int qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }

    public Farmacia(String nome, String endereco, int estoqueMedicamentos, int qtdeFuncionarios, int qtdeVendas) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoqueMedicamentos = estoqueMedicamentos;
        this.qtdeFuncionarios = qtdeFuncionarios;
        this.qtdeVendas = qtdeVendas;
    }

    @Override
    public String toString() {
        return "Farmacia{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", estoqueMedicamentos=" + estoqueMedicamentos +
                ", qtdeFuncionarios=" + qtdeFuncionarios +
                ", qtdeVendas=" + qtdeVendas +
                '}';
    }

    public String vizualizar() {
        return toString();
    }
}
