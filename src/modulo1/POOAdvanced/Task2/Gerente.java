package modulo1.POOAdvanced.Task2;

public class Gerente extends Funcionario{

    private double participacaoEmLucros;

    public Gerente(String nome, String sobrenome, String setor, String cargo, double remuneracao, double participacaoEmLucros) {
        super(nome, sobrenome, setor, cargo, remuneracao);
        this.participacaoEmLucros = participacaoEmLucros;
    }

    public double getParticipacaoEmLucros() {
        return participacaoEmLucros;
    }

    public void setParticipacaoEmLucros(double participacaoEmLucros) {
        this.participacaoEmLucros = participacaoEmLucros;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Classe Gerente.");
        System.out.println("Participação em lucros: "+participacaoEmLucros);
        System.out.println("***********************************************");
    }
}
