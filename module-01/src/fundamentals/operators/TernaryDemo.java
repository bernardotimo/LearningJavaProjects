package fundamentals.operators;

public class TernaryDemo {

    public static void main(String[] args) {

        //Compact conditional operator
        //int max = (a > b) ? a : b;
        //Ternary structure: Answer -> Question (IF) -> Else
        //If a > b is true, assign a to max; otherwise, assign b to max.

        //Simple example
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("Max value: " + max);

        //Assignments
        double balance = 500.0;

        double fee = (balance < 1000) ? 25.0 : 0.0;

        System.out.println("Fee: $" + fee);

        //Nested ternary
        int score = 83;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";

        System.out.println("Grade: " + grade);
    }

}
