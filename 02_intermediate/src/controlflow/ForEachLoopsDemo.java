package controlflow;

import java.util.ArrayList;
import java.util.List;

// for (Type variable : collection(iterable))
// Iterates through every element of an array or collection without using an index

//Pros:                                                 // Cons:
// - Improves readabilities over normal for loops       // - Not working with indexes
// - Removes extra setup                                // - Can only use the value it gets

public class ForEachLoopsDemo {

    public static void main (String[] args) {

        arrayExample();
        stringExample();
        collectionExample();
        sumExample();
        nestedExample();
        weightChanger();
    }

    public static void arrayExample() {

        System.out.println("\n=== ARRAY ===\n");

        int[] numbers = {10, 20, 30, 40};

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }

    public static void stringExample() {

        System.out.println("\n=== STRING ===\n");

        String[] names = {"Alice", "Marta", "Bernardo", "John"};

        for (String name: names) {
            System.out.println("Hello " + name);
        }
        System.out.println();
    }

    public static void collectionExample() {

        System.out.println("\n=== COLLECTION ===\n");

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
    }

    public static void sumExample() {

        System.out.println("\n=== SUM ===\n");

        int[] values = {5, 10, 15};

        int sum = 0;

        for (int value: values){
            sum += value;
        }
        System.out.println("Total: " + sum);
        System.out.println();
    }

    public static void nestedExample() {

        System.out.println("\n=== NESTED LOOP ===\n");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int [] row : matrix ) {
            for (int number: row) {
                System.out.println(number + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void weightChanger() {

        System.out.println("\n=== WEIGHT CHANGER ===\n");

        int[] weights = {198, 190, 188, 187, 190, 198, 201, 250, 203, 210, 205, 170, 180, 200, 203, 210, 180};

        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            if (weight > 220) {
                weights[i] = 198;
            }
        }

        for (int weight : weights){
            System.out.println(weight);
        }
    }


}
