package collectionsTask;

import myUtils.Range;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task3 {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        var numbersInput = constructHashSet();
        printHashMap(numbersInput);
    }

    public static HashSet<Integer> constructHashSet(){
        var result = new HashSet<Integer>();
        for (var x : Range.range(10)) {
            System.out.printf("(%d de 10) Digite um número e não repita: ", x);
            result.add(Integer.parseInt(scanner.nextLine()));
        }
        return result;
    }
    public static void printHashMap(HashSet<Integer> numbersInput) {
        Iterator<Integer> iterator = numbersInput.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}