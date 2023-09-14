package modulo1.arrayMatriz;

import java.util.Scanner;


public class Task2 {

    public static Scanner scanner = new Scanner(System.in);
    final public static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        var myVector = mountVector();

        var oddIdxN = oddIdxNumbers(myVector);
        var evenN = evenNumbers(myVector);
        var sunVector = sun(myVector);
        var meanVector = mean(myVector);

        System.out.println("Elementos nos índices ímpares:");
        printVector(oddIdxN);
        System.out.println("Elementos pares:");
        printVector(evenN);
        System.out.printf("soma: %.2f\n", sunVector);
        System.out.printf("media: %.2f\n", meanVector);
    }

    private static int[] evenNumbers(int[] myVector) {
        int[] result = new int[ARRAY_LENGTH/2];
        int cont = 0;
        for (int i = 0; i < myVector.length; i++) {
            if (isEven(myVector[i])) {
                result[cont] = myVector[i];
                cont++;
            }
        }
        return result;
    }

    private static int[] oddIdxNumbers(int[] myVector) {
        int[] result = new int[ARRAY_LENGTH/2];
        int cont = 0;
        for (int i = 0; i < myVector.length; i++) {
            if (isOdd(i)) {
                result[cont] = myVector[i];
                cont++;
            }
        }
        return result;
    }

    private static boolean isOdd(int number) {return !(number % 2 == 0) ;}
    private static boolean isEven(int number) {return (number % 2 == 0) ;}

    private static float mean(int[] myVector) {
        return sun(myVector) / myVector.length;
    }

    private static float sun(int[] myVector) {
        float sun = 0.0f;
        for (int x : myVector) {
            sun += x;
        }
        return sun;
    }

    private static int[] mountVector() {
        int[] vetorInput = new int[ARRAY_LENGTH];

        for (int i : range(ARRAY_LENGTH)) {
            System.out.printf("Digiete o %dº número: ", i + 1);
            var chosenNumber = Integer.parseInt(scanner.nextLine());
            vetorInput[i] = chosenNumber;
        }
        return vetorInput;
    }

    private static void printVector(int[] arrayInt) {
        for (int x : arrayInt) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static int[] range(int stop) {
        int[] arrayResult = new int[stop];
        for (int i = 0; i < stop; i++) {
            arrayResult[i] = i;
        }
        return arrayResult;
    }
}
