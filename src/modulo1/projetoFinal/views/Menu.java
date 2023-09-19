package modulo1.projetoFinal.views;

import modulo1.myUtils.StrUtil;
import modulo1.projetoFinal.exception.TransacaoInvalidaException;
import modulo1.projetoFinal.models.ContaPF;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public Scanner scanner = new Scanner(System.in);

    public void bemVindo(){
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("  - Bem Vindo ao Banco XPTO -  ");
        System.out.println("* * * * * * * * * * * * * * * *");
    }

    public ContaPF cadastraUsuario() {
        System.out.println(" - - Cadastro de usuário - -  ");

        var nome = pedirNome();
        var sobrenome = pedirSobrenome();
        var cpf = pedirCPF();
        var primeiroDeposito = pedirPrimeiroDeposito();

        return new ContaPF(nome, sobrenome, cpf, primeiroDeposito);
    }

    private Double pedirPrimeiroDeposito() {
        while (true) {
            System.out.print("Digite o valor do seu depósito inicial: ");
            var primeiroDeposito = Double.parseDouble(scanner.nextLine());
            if (primeiroDeposito > 0) {
                return  primeiroDeposito;
            }
            else {
                System.out.println("O primeiro depósito não pode ser zero ou negativo.\n");
            }
        }

    }

    private String pedirNome() {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();
    }

    private String pedirSobrenome() {
        System.out.print("Digite seu sobrenome: ");
        return scanner.nextLine();
    }

    private String pedirCPF() {
        while (true) {
            System.out.print("Digite seu CPF (11 numeros): ");
            var cpf = scanner.nextLine();
            if(cpf.length() != 11) {
                System.out.println("CPF inválido - tente novamente.\n");
                continue;
            }
            return cpf;
        }
    }



    public int escolherOperacao() {
        while (true) {
            System.out.println("Escolha uma operação abaixo:");
            System.out.println("1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Ver extrato\n5 - Para sair");

            try {
                var escolha = Integer.parseInt(scanner.nextLine());
                    return escolha;
            } catch (NumberFormatException e ) {
                System.out.println("Operação invalida, tente novamente.");
            }
        }
    }

    public void rotinaDepositar(ContaPF usuario) {
        while (true) {
            System.out.print("Digite o valor que deseja depositar: ");
            try {
                var deposito = Double.parseDouble(scanner.nextLine());
                usuario.depositar(deposito);

                var msg = String.format(
                        "O valor de R$ %,.2f foi depositado.\nSeu novo saldo é R$ %,.2f",
                        deposito, usuario.getSaldo()
                );

                printarBonito("Operação de Depósito", msg);

                break;
            } catch (NumberFormatException | TransacaoInvalidaException e) {
                System.out.println("O valor informado é invalido.");
            }
        }
    }
    public void rotinaSacar(ContaPF usuario) {
        while (true) {
            System.out.println("Digite o valor que deseja sacar: ");
            try {
                var saque = Double.parseDouble(scanner.nextLine());
                usuario.sacar(saque);

                var msg = String.format(
                        "O valor de R$ %,.2f foi resgatado.\nSeu novo saldo é R$ %,.2f",
                        saque, usuario.getSaldo()
                );

                printarBonito("Operação de Saque", msg);
                break;
            } catch (NumberFormatException e) {
                System.out.println("O valor informado é invalido.\n");
            } catch (TransacaoInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void rotinaExtrato(ContaPF usuario) {
        printarBonito("Extrato", usuario.getExtrato());
    }

    public void rotinaVerSaldo(ContaPF usuario) {
        printarBonito("Saldo", String.format("Seu saldo é: R$ %,.2f", usuario.getSaldo()));
    }

    private void printarBonito(String titulo, String mensagem){
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(StrUtil.centerStr(titulo,44,"-"));
        System.out.println(mensagem);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -\n");
    }
    private void printarBonito(String titulo, ArrayList mensagem){
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(StrUtil.centerStr(titulo,44,"-"));
        for (var item : mensagem){
            System.out.println(item);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -\n");
    }

    public void sair(ContaPF usuario) {
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * *");
        System.out.println("Obrigado por usar os nossos serviços");
        System.out.printf("Até logo %s.\n",usuario.nomeCompleto());
        System.out.println("* * * * * * * * * * * * * * * * * * *");
        System.exit(0);
    }

    public void escolhaInvalida() {
        System.out.println("O número passado é inválido.\nTente novamente.");
    }
}
