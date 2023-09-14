package modulo1.stackAndQueue;

import java.util.*;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);
    public static Stack<String> myStack = new Stack<>();

    public static int numberChosen;
    public static boolean exitLoop = false;
    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.print("Entre com a opção desejada: ");
            try {
                numberChosen = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Numero inválido, tente novamente.");
                continue;
            }
            switch (numberChosen) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    myStack.push(scanner.nextLine());
                    System.out.println("Pilha atualizada: " + myStack);
                    break;
                case 2:
                    System.out.println("Livros na pilha: " + myStack);
                    break;
                case 3:
                    try {
                        System.out.println("Removendo: " + myStack.pop());
                        System.out.println("Pilha atualizada: " + myStack);
                    } catch (EmptyStackException e) {
                        System.out.println("Pilha vazia, nada para remover: " + myStack);
                    }
                    break;
                case 0:
                    System.out.println("Saindo.");
                    exitLoop = true;
                    break;
            }
            if (exitLoop) {break;}
        }
    }

    public static void menu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("            1 - Adicionar Livro na pilha");
        System.out.println("            2 - Listar todos os Livros");
        System.out.println("            3 - Retirar Livro da Fila");
        System.out.println("            0 - Sair");
        System.out.println();
        System.out.println("*********************************************************");
    }
}
