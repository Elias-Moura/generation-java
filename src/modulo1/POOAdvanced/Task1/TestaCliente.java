package modulo1.POOAdvanced.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaCliente {
    public static void main(String[] args) {
        var cl1 = new PessoaFisica("Elias", "Moura", 23, 105, 1.85f, "12312312312");
        var cl2 = new PessoaFisica("Gustavo", "Mesquita", 21, 90, 1.80f, "09876346262");

        var cl3 = new PessoaJuridica("Sucos S.A.","Ferreira", 50, 0.0f, 0.0f, "06603546000113");
        var cl4 = new PessoaJuridica("Tranpostadora S.A.","Pereira", 102, 0.0f, 0.0f, "06603546000113");

        var clientes = new ArrayList<Cliente>(Arrays.asList(cl1,cl2,cl3,cl4));

        System.out.println();
        for (var cliente: clientes) {
            cliente.visualizar();
            System.out.println();
        }
    }
}
