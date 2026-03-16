package controlflow;

public class ForLoops {

    public static void main (String[] args) {

        basicLoop();
        reverseLoop();
        stepLoop();
        nestedLoop();
        arrayLoop();
        enhancedForLoop();
        spellingExercise();
    }

    public static void basicLoop() {

        System.out.println("\n=== BASIC LOOP ===\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println();
    }

    public static void reverseLoop() {

        System.out.println("\n=== REVERSE LOOP ===\n");

        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println();
    }

    public static void stepLoop() {

        System.out.println("\n=== STEP LOOP ===\n");

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Value: " + i);
        }
        System.out.println();
    }

    public static void nestedLoop() {

        System.out.println("\n=== NESTED LOOP ===\n");

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("[" + row + "," + col + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void arrayLoop(){

        System.out.println("\n=== ARRAY LOOP ===\n");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + ": " + numbers[i]);
        }
        System.out.println();
    }

    public static void enhancedForLoop() {

        System.out.println("\n=== ENHANCED FOR LOOP ===\n");

        String[] names = {"Alice", "Bob", "Bernardo", "Mike"};

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void spellingExercise() {

        System.out.println("\n=== SPELLING EXERCISE ===\n");

        String toSpell = "conscientious";
        int wordLength = toSpell.length();

        for (int i = 0; i < wordLength; i++) {
            System.out.println(toSpell.charAt(i));
        }
    }
}
