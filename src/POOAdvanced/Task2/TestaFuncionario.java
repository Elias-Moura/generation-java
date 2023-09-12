package POOAdvanced.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaFuncionario {
    public static void main(String[] args) {
        var funcionario1 = new Gerente("Elias", "Moura", "Segurança da informação", "Analista de defesa cibernética", 12000, 0.02);
        var funcionario2 = new Gerente("Gustavo", "Mesquita", "Recursos Humanos", "Recrutador", 5000, 0.01);

        var funcionario3 = new Vendedor("Alvaro", "Ferreira", "Laticínios", "Junior", 1500, 0.2);
        var funcionario4 = new Vendedor("Lucas", "Pereira", "Eletrônicos", "Pleno", 2600, 0.25);

        var funcionarios = new ArrayList<Funcionario>(Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4));

        System.out.println();
        for (var funcionario : funcionarios) {
            funcionario.visualizar();
            System.out.println();
        }
    }
}
