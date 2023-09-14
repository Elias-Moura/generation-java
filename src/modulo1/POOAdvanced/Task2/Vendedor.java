package modulo1.POOAdvanced.Task2;

public class Vendedor extends Funcionario{
    private double bonusSalarial;

    public Vendedor(String nome, String sobrenome, String setor, String cargo, double remuneracao, double bonusSalarial) {
        super(nome, sobrenome, setor, cargo, remuneracao);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Classe Vendedor.");
        System.out.println("bonusSalarial: "+bonusSalarial);
        System.out.println("*******************************");
    }
}

