package modulo1.stackAndQueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class Task1 {

    public static Scanner scanner = new Scanner(System.in);
    public static Queue<String> myQueue = new LinkedList<String>();

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
                    System.out.print("\nDigite o nome do cliente: ");
                    myQueue.add(scanner.nextLine());
                    System.out.println("Fila atualizada: " + myQueue);
                    break;
                case 2:
                    System.out.println("Clientes na fila: " + myQueue);
                    break;
                case 3:
                    try {
                        System.out.println("Removendo: " + myQueue.remove());
                        System.out.println("Fila atualizada: " + myQueue);
                    } catch (NoSuchElementException e) {
                        System.out.println("Fila vazia, nada para remover: " + myQueue);
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

    public static void menu() {
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("            1 - Adicionar Cliente na Fila");
        System.out.println("            2 - Listar todos os Cliente");
        System.out.println("            3 - Retirar Cliente da Fila");
        System.out.println("            0 - Sair");
        System.out.println();
        System.out.println("*********************************************************");
    }

}