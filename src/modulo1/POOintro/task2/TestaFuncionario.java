package modulo1.POOintro.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaFuncionario {
    public static void main(String[] args) {
        var func1 = new Funcionario("Eduardo", "Vieira", "Cozinha", "Cozinheiro", 2600.0);
        var func2 = new Funcionario("Julia", "Almeida", "Salão", "Garçon", 1700.0);

        var funcionarios = new ArrayList<>(Arrays.asList(func1, func2));

        for (var funcionario : funcionarios) {
            System.out.println(funcionario.vizualizar());
        }
    }
}
