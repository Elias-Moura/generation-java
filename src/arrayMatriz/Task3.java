package arrayMatriz;

import java.util.Scanner;

public class Task3 {

    public static Scanner scanner = new Scanner(System.in);
    public static int[][] matrizExemple = {{1,2,3},{4,5,6}, {7,8,9}};
    public static void main(String[] args) {
        /*
        *  1- Ler e montar matriz
        *  2- montar a saída
        * */
        var leadingDiagonal = new int[3];
        var secondaryDiagonal = new int[3];
        float sunLeadDiag;
        float sunSecondDiag;

        System.out.println("Elementos da diagonal principal: ");
        printVector(leadingDiagonal);
        System.out.println("Elementos da diagonal secundaria: ");
        printVector(secondaryDiagonal);
        System.out.printf("Soma dos Elementos da Diagonal Principal: %.2f\n", sunLeadDiag );
        System.out.printf("Soma dos Elementos da Diagonal Secundária: %.2f", sunSecondDiag);
    }

    private static void printVector(int[] arrayInt) {
        for (int x : arrayInt) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
