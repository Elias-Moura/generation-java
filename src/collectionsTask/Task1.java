package collectionsTask;

import myUtils.Range;

import java.sql.SQLOutput;
import java.util.*;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> listColor = new ArrayList<>();

    public static void main(String[] args) {
        for(var x : Range.range(5)){
            System.out.printf("(%d de 5) Digite uma cor. \n", x);
            listColor.add(scanner.nextLine());
        }

        System.out.println("Listar todas as cores: ");
        print(listColor);

        System.out.println("\nOrdenar as cores: ");
        Collections.sort(listColor);
        print(listColor);
    }

    public static void print(ArrayList<String> listObject) {
        for (var x : listObject) {
            System.out.println(x);
        }
    }
}
