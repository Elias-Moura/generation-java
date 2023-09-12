package POOAdvanced.Task1;

public class PessoaJuridica extends Cliente{

    private String CNPJ;

    public PessoaJuridica(String nome, String sobreNome, int idade, float peso, float altura, String cnpj) {
        super(nome, sobreNome, idade, peso, altura);
        CNPJ = cnpj;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Classe PessoaJuridica");
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("***********************");
    }
}
