package modulo1.projetoFinal;

import modulo1.myUtils.StrUtil;
import modulo1.projetoFinal.exception.TransacaoInvalidaException;
import modulo1.projetoFinal.models.ContaPF;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
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
                System.out.printf("O valor informado é invalido.\n");
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
            } catch (NumberFormatException | TransacaoInvalidaException e) {
                System.out.printf("O valor informado é invalido.\n");
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
}
