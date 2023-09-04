package arrayMatriz;

import java.util.Scanner;

/*
 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano.
 * As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais,
 * logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais,
 * armazene as médias de cada participante e exiba as médias de cada um na tela.
 *
4.0 5.0 7.0 3.0
2.5 6.5 4.7 8.0
10.0 8.5 9.5 8.0
9.0 6.5 7.6 8.2
5.0 5.0 5.0 6.3
7.0 8.0 9.0 8.5
5.5 3.5 2.5 1.0
8.0 9.0 10.0 9.5
5.6 5.8 6.5 7.0
7.5 8.5 9.5 10.0
*/

public class Task4 {

    public static Scanner scanner = new Scanner(System.in);
    public static float[][] noteMatrix = {
            {4.0f, 5.0f, 7.0f, 3.0f},
            {2.5f, 6.5f, 4.7f, 8.0f},
            {10.0f, 8.5f, 9.5f, 8.0f},
            {9.0f, 6.5f, 7.6f, 8.2f},
            {5.0f, 5.0f, 5.0f, 6.3f},
            {7.0f, 8.0f, 9.0f, 8.5f},
            {5.5f, 3.5f, 2.5f, 1.0f},
            {8.0f, 9.0f, 10.0f, 9.5f},
            {5.6f, 5.8f, 6.5f, 7.0f},
            {7.5f, 8.5f, 9.5f, 10.0f},
    };

    public static final int ARRAY_LENGHT = noteMatrix.length;

    public static void main(String[] args) {
//        var meansVector = getMeans(noteMatrix);
        var meansVector = getMeans(createMatrix());
        System.out.println("As médias são: ");
        printVector(meansVector);
    }


    public static float[][] createMatrix() {
        float[][] matrix = new float[10][4];
        for (int i : range(10)) {
            System.out.printf("Digite as 4 notas do %dº aluno separadas por espaço.\n", i + 1);
            var notes = scanner.nextLine().split(" ");
            for (int j = 0; j < notes.length; j++) {
                matrix[i][j] = Float.parseFloat(notes[j].replace(',', '.'));
            }
        }
        return matrix;
    }

    private static float[] getMeans(float[][] noteMatrix) {
        var result = new float[ARRAY_LENGHT];
        var count = 0;
        for (int i = 0; i < noteMatrix.length; i++) {
            result[count] = sun(noteMatrix[i]) / noteMatrix[i].length;
            count++;
        }
        return result;
    }


    private static float sun(float[] myVector) {
        float sun = 0.0f;
        for (float x : myVector) {
            sun += x;
        }
        return sun;
    }

    private static void printVector(float[] arrayInt) {
        for (var x : arrayInt) {
            System.out.printf("%.1f |", x);
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
