package controlflow;

public class IfStatementsDemo {

    public static void main(String[] args) {

        //If the condition is true, the code inside curly brackets runs
        //Use comparison operators such as ==, != >, <, >=, <=...
        gradeExample(85);
        message("That is for you");
    }

    // Integers
    public static void gradeExample(int score) {

        System.out.println("\n=== GRADE EXAMPLE ===\n");

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade C:");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
    }

    //Strings
    public static void message(String phrase) {

        System.out.println("\n=== STRING EXAMPLE ===\n");

        if (phrase.equals("That is for you")) {
            System.out.println("Try again");
        } else {
            System.out.println("Message Accepted");
        }
    }
}
