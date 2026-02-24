package fundamentals.scanner;
import java.util.Scanner;

public class UserInputDemo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your height: ");
        String heightInput = scanner.nextLine();

        double height = Double.parseDouble(
                heightInput.replace(",",".")
        );

        System.out.printf("Your name is %s, you're %d old and %.2fm tall", name, age, height);

        scanner.close();

    }
}
