package modulo1.projetoFinal;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;

/*
*
* Arrumar falha -> posso resgatar valor a maior do que eu possuo.
*
*
*/

public class main {
    public static void main(String[] args) throws TransacaoInvalidaException {
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
                case 5:
                    menu.sair(usuario);
                    break;
            }
        }
    }
}
