package controlflow;

public class IfStatementsDemo {

    public static void main(String[] args) {

        //If the condition is true, the code inside curly brackets runs
        //Use comparison operators such as ==, != >, <, >=, <=...
        int score = 94;

        if (score >= 90) {
            System.out.println("Excellent");
        }

        if (score >= 70 && score < 90) {
            System.out.println("Good job");
        }

        if (score < 70 && score> 0) {
            System.out.println("Try again");
        }

        if (score != 0) {
            System.out.println("You got some points");
        }

        if (score == 100) {
            System.out.println("Wow, you got it all!");
        }

        //Strings
        String message = "That is for you";
        if (message.equals("f")) {
            System.out.println("Try again");
        }
    }
}
