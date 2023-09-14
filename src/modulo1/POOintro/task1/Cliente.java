package modulo1.POOintro.task1;

public class Cliente {

    private String nome;
    private String sobrenome;
    private int idade;
    private String regiao;
    private int qtdCompras;

    public Cliente(String nome, String sobrenome, int idade, String regiao, int qtdCompras) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.regiao = regiao;
        this.qtdCompras = qtdCompras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setQtdCompras(int qtdCompras) {
        this.qtdCompras = qtdCompras;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade='" + idade + '\'' +
                ", regiao='" + regiao + '\'' +
                ", qtdCompras=" + qtdCompras +
                '}';
    }

    public String visualizar() {
        return toString();
    }
}
