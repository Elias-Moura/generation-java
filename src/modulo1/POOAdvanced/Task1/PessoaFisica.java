package modulo1.POOAdvanced.Task1;

public class PessoaFisica extends Cliente{
    private String CPF;

    public PessoaFisica(String nome, String sobreNome, int idade, float peso, float altura, String CPF) {
        super(nome, sobreNome, idade, peso, altura);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Classe: PessoaFísica.");
        System.out.println("CPF: " + CPF);
        System.out.println("***************************");
    }
}
