package modulo1.collectionsTask;

import java.util.*;

public class Task4 {
    public static Scanner scanner = new Scanner(System.in);
    public static HashSet<Integer> numbers = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));


    public static void main(String[] args) {
        while (true) {
            System.out.print("\n(-1) para sair - Digite o número que você deseja encontrar: ");
            var numberChosen = Integer.parseInt(scanner.nextLine());
            var numberExists = numbers.contains(numberChosen);

            if (numberChosen == -1) {break;}
            if (numberExists) {
                System.out.printf("O número %d foi encontrado\n",numberChosen);
            } else {
                System.out.printf("O número %d não foi encontrado.\n", numberChosen);
            }
        }
    }
}