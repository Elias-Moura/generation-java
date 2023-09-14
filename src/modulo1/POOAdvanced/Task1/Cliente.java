package modulo1.POOAdvanced.Task1;

public class Cliente {
    private String nome;
    private String sobreNome;
    private int idade;
    private float peso;
    private float altura;

    public Cliente(String nome, String sobreNome, int idade, float peso, float altura) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void visualizar() {
        var mensagem = String.format(
                "Pessoa(nome=%s, sobreNome=%s, idade=%d, peso=%.2f, altura=%.2f)",
                nome, sobreNome, idade, peso, altura
        );
        System.out.println("************************************");
        System.out.println(mensagem);
        System.out.println("************************************");
    }
}
