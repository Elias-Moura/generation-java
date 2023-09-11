package POOintro.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaGame {
    public static void main(String[] args) {
        var produto1 = new Produto("controle xbox", "periféricos", 450.00, 30,500);
        var produto2 = new Produto("Xbox Series X", "consoles", 4500.00, 10,3000);

        var produtos = new ArrayList<>(Arrays.asList(produto1, produto2));

        for (var produto : produtos) {
            System.out.println(produto.visualizar());
        }
    }
}
