package modulo1.projetoFinal;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;

public class Main {
    public static void main(String[] args) throws TransacaoInvalidaException {
        var menu = new Menu();

        menu.bemVindo();
        var usuario = menu.cadastraUsuario();

        System.out.println(usuario+"\n");

        //noinspection InfiniteLoopStatement
        while (true) {
            var escolha = menu.escolherOperacao();

            switch (escolha) {
                case 1 -> menu.rotinaVerSaldo(usuario);
                case 2 -> menu.rotinaDepositar(usuario);
                case 3 -> menu.rotinaSacar(usuario);
                case 4 -> menu.rotinaExtrato(usuario);
                case 5 -> menu.sair(usuario);
            }
        }
    }
}
