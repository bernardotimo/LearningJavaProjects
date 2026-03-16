package controlflow;

public class WhileLoops {

    public static void main (String[] args) {

        basicWhileLoop();
        countDownExample();
        sumExample();
        sentinel();
        nestedWhile();
    }

    public static void basicWhileLoop() {

        System.out.println("\n=== BASIC WHILE LOOP ===\n");

        int i = 1;

        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
        System.out.println();
    }

    public static void countDownExample() {

        System.out.println("\n=== COUNTDOWN EXAMPLE ===\n");

        int i = 5;

        while (i > 0) {
            System.out.println("Countdown: " + i);
            i--;
        }
        System.out.println();
    }

    public static void sumExample() {

        System.out.println("\n=== SUM EXAMPLE ===\n");

        int number = 1;
        int sum = 0;

        while (number <= 5) {
            sum += number;
            number++;
        }
        System.out.println("Total: " + sum);
        System.out.println();
    }

    public static void sentinel() {

        System.out.println("\n=== SENTINEL ===\n");

        int value = 3;

        while (value != 0) {
            System.out.println("Processing value: " + value);
            value--; // simulate input change
        }
        System.out.println("Loop stopped\n");
    }

    public static void nestedWhile() {

        System.out.println("\n=== NESTED WHILE ===\n");

        int row = 1;

        while (row <= 3) {
            int col = 1;
            while (col <= 3) {
                System.out.println("[" + row + "," + col + "] ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
    }
}
