package modulo1.arrayMatriz;

import java.util.Scanner;

/*
 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar
 * dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor.
 * Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
 * */
public class Task1 {

    public static int[] vectorInt = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
    public static Scanner scanner = new Scanner(System.in);


    public static void print(Object... args) {
        for (Object arg : args) {
            System.out.print(arg);
            System.out.print(" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        while (true) {
            print("Digite x para sair.");
            print("Digite um numero inteiro para pesquisar no array: ");
            var chosenNumber = scanner.nextLine();

            if (stopLoop(chosenNumber)) {break;}
            if (isInteger(chosenNumber)) {
                var chosenNumberInteger = Integer.parseInt(chosenNumber);
                var result = findInArray(chosenNumberInteger, vectorInt);
                if (!isEmpty(result)) {
                    print("O número " + result[0] + " está localizado na posiação " + result[1]);
                } else {
                    print(String.format("O número %d não foi encontrado!", chosenNumberInteger));
                }
                ;

            } else {
                print("Por favor digite um número inteiro.");
            };
        }
    }


    private static boolean stopLoop(String s) {return s.equalsIgnoreCase("x");}
    private static boolean isEmpty(int[] vector) {
        return vector.length == 0;
    }

    private static int[] findInArray(int chosenNumber, int[] vectorInt) {
        for (int i = 0; i < vectorInt.length; i++) {
            if (chosenNumber == vectorInt[i]) {
                return new int[]{chosenNumber, i};
            }
        }
        return new int[]{};
    }

    private static boolean isInteger(String chosenNumber) {
        boolean result = false;
        try {
            var integer = Integer.parseInt(chosenNumber);
            result = true;
        } catch (ClassCastException | NumberFormatException e) {}
        return result;
    }
}
