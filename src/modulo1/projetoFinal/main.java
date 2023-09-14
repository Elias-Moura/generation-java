package modulo1.projetoFinal;

import modulo1.projetoFinal.exception.OperacaoDeDepositoInvalida;
import modulo1.projetoFinal.models.ContaPF;

public class main {
    public static void main(String[] args) throws OperacaoDeDepositoInvalida {
        var menu = new Menu();

        menu.exibirMenu();
        var usuario = menu.cadastraUsuario();

        System.out.println(usuario+"\n");

        while (true) {
            var escolha = menu.escolherOperacao();

            switch (escolha) {
                case 1:
                    menu.rotinaVerSaldo(usuario);
                    break;
                case 2:
                    menu.rotinaDepositar(usuario);
                    break;
                case 3:
                    menu.rotinaSacar(usuario);
                    break;
                case 4:
                    menu.rotinaExtrato(usuario);
                    break;
            }
        }
    }
}
