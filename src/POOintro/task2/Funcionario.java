package POOintro.task2;

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

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSetor() {
        return setor;
    }

    public String getCargo() {
        return cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", setor='" + setor + '\'' +
                ", cargo='" + cargo + '\'' +
                ", remuneracao=" + remuneracao +
                '}';
    }

    public String vizualizar() {
        return toString();
    }
}
