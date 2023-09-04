package collectionsTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));


    public static void main(String[] args) {
        while (true) {
            System.out.print("\n(-1) para sair - Digite o número que você deseja encontrar: ");
            var numberChosen = Integer.parseInt(scanner.nextLine());
            var indexInList = numbers.indexOf(numberChosen);

            if (numberChosen == -1) {break;}
            if (indexInList > 0) {
                System.out.printf("O número %d está localizado na posição %d\n",numberChosen, indexInList);
            } else {
                System.out.printf("O número %d não foi encontrado.\n", numberChosen);
            }
        }
    }
}
