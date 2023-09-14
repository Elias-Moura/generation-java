package modulo1.POOAdvanced.Task2;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String setor;
    private String cargo;
    private double remuneracao;

    public Funcionario(String nome, String sobrenome, String setor, String cargo, double remuneracao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setor = setor;
        this.cargo = cargo;
        this.remuneracao = remuneracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public void visualizar() {
        var mensagem = String.format(
                "Funcionario(nome=%s, sobreNome=%s, setor=%s, cargo=%s, remuneração=%.2f)",
                nome, sobrenome, setor, cargo, remuneracao
        );
        System.out.println("************************************");
        System.out.println(mensagem);
        System.out.println("************************************");
    }
}