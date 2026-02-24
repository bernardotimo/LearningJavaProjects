package fundamentals.conditionals;

public class ConditionalsDemo {

    public static void main(String[] args) {

        int age = 100;

        if (age < 0) {
            System.out.println("Type a valid age");
        } else if (age >= 0 && age < 18) {
            System.out.println("Kid");
        } else {
            System.out.println("Adult");
        }
    }
}
