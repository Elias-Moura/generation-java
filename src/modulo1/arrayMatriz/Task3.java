package modulo1.arrayMatriz;

import java.util.Scanner;

public class Task3 {

    private static final int ARRAY_LENGHT = 3;
    public static Scanner scanner = new Scanner(System.in);
    public static int[][] matrizExemple = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        /*
         *  1- Ler e montar matriz
         *  2- montar a saída
         * */
        var matrixCreated = createMatrix();
//        var leadingDiagonal = getLeadDiag(matrizExemple);
//        var secondaryDiagonal = getSecDiag(matrizExemple);
        var leadingDiagonal = getLeadDiag(matrixCreated);
        var secondaryDiagonal = getSecDiag(matrixCreated);
        float sunLeadDiag = sun(leadingDiagonal);
        float sunSecondDiag = sun(secondaryDiagonal);

        System.out.println();
        System.out.println("Elementos da diagonal principal: ");
        printVector(leadingDiagonal);
        System.out.println("Elementos da diagonal secundaria: ");
        printVector(secondaryDiagonal);
        System.out.printf("Soma dos Elementos da Diagonal Principal: %.2f\n", sunLeadDiag );
        System.out.printf("Soma dos Elementos da Diagonal Secundária: %.2f", sunSecondDiag);
    }

    public static int[][] createMatrix() {
        int[][] matrix = new int[3][3];
        for (int i : range(3)) {
            System.out.printf("(%d de 3) -> Digite os 3 numeros:.\n", i+1);
            var notes = scanner.nextLine().split(" ");
            for (int j = 0; j < notes.length; j++) {
                matrix[i][j] = Integer.parseInt(notes[j].replace(',', '.'));
            }
        }
        return matrix;
    }


    private static float sun(int[] myVector) {
        float sun = 0.0f;
        for (int x : myVector) {
            sun += x;
        }
        return sun;
    }
    private static int[] getLeadDiag(int[][] matrizExemple) {
        var leadDiag = new int[ARRAY_LENGHT];
        var count = 0;
        // 00 , 11, 22

        for (int i = 0; i < matrizExemple.length; i++) {
            for (int j = 0; j < matrizExemple[0].length; j++){
                if ( i == j) {
                    leadDiag[count] = matrizExemple[i][j];
                    count++;
                }
            }
        }
        return leadDiag;
    }

    private static int[] getSecDiag(int[][] matrizExemple) {
        var leadDiag = new int[ARRAY_LENGHT];
        var count = 0;
        // 00 , 11, 22

        for (int i = 0; i < matrizExemple.length; i++) {
            for (int j = 0; j < matrizExemple[0].length; j++){
                if ( i + j == matrizExemple.length - 1 ) {
                    leadDiag[count] = matrizExemple[i][j];
                    count++;
                }
            }
        }
        return leadDiag;
    }

    private static void printVector(int[] arrayInt) {
        for (int x : arrayInt) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] range(int stop) {
        int[] arrayResult = new int[stop];
        for (int i = 0; i < stop; i++) {
            arrayResult[i] = i;
        }
        return arrayResult;
    }
}
