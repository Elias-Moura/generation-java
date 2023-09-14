package modulo1.projetoFinal;

import modulo1.projetoFinal.exception.OperacaoDeDepositoInvalida;
import modulo1.projetoFinal.models.ClienteABC;
import modulo1.projetoFinal.models.ContaPF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public Scanner scanner = new Scanner(System.in);

    private void run(){
        exibirMenu();
    }
    private void bemVindo(){
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("  - Bem Vindo ao Banco XPTO -  ");
        System.out.println("* * * * * * * * * * * * * * * *");
    }

    public ContaPF cadastraUsuario() {
        System.out.println(" - - Cadastro de usuário - -  ");
        System.out.print("Digite seu nome: ");
        var nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        var sobrenome = scanner.nextLine();

        System.out.print("Digite seu CPF (11 numeros): ");
        var cpf = scanner.nextLine();

        System.out.print("Digite o valor do seu depósito inicial: ");
        var primeiroDeposito = Double.parseDouble(scanner.nextLine());

        return new ContaPF(nome, sobrenome, cpf, primeiroDeposito);
    }

    public void exibirMenu() {
        bemVindo();

    }

    private boolean validaOperacao(int opcaoDeOperacao) {
        return opcaoDeOperacao >=1 && opcaoDeOperacao <=4;
    }
    public int escolherOperacao() {
        while (true) {
            System.out.println("Escolha uma operação abaixo:");
            System.out.println("1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Ver extrato");

            try {
                var escolha = Integer.parseInt(scanner.nextLine());

                if (validaOperacao(escolha)) {
                    return escolha;
                } else {
                    System.out.printf("%d não é uma operação invalida, tente novamente.\n", escolha);
                }

            } catch (NumberFormatException e ) {
                System.out.printf("Operação invalida, tente novamente.\n");
                continue;
            }
        }
    }

    public void rotinaDepositar(ContaPF usuario) {
        while (true) {
            System.out.println("Digite o valor que deseja depositar: ");
            try {
                var deposito = Double.parseDouble(scanner.nextLine());
                usuario.depositar(deposito);
                System.out.printf(
                        "O valor R$ %,.2f foi depositado e seu novo saldo é R$ %,.2f\n",
                        deposito, usuario.getSaldo()
                );
                break;
            } catch (NumberFormatException | OperacaoDeDepositoInvalida e) {
                System.out.printf("O valor informado é invalido.\n");
            }
        }
    }
    public void rotinaSacar(ContaPF usuario) {
    }

    public void rotinaExtrato(ContaPF usuario) {
        usuario.verExtrato();
    }

    public void rotinaVerSaldo(ContaPF usuario) {
        System.out.printf("Seu saldo é R$ %,.2f\n", usuario.getSaldo());
    }
}
