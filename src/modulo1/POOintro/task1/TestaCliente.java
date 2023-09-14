package modulo1.POOintro.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaCliente {
    public static void main(String[] args) {
        var cliente1 = new Cliente("Elias", "Moura", 23, "Rio de Janiero", 1);
        var cliente2 = new Cliente("Gabriella", "Andrade", 24, "Rio de Janeiro", 4);

        var listaDeClientes = new ArrayList<Cliente>(Arrays.asList(cliente1, cliente2));

        for (var cliente : listaDeClientes) {
            System.out.println(cliente.visualizar());
        }
    }
}
