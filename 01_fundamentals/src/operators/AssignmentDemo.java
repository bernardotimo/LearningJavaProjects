package operators;

public class AssignmentDemo {

    public static void main(String[] args) {

        int balance = 1000;
        System.out.println("Initial balance: $" + balance);

        balance += 250; // balance = balance + 250
        System.out.println("After deposit: $" + balance);

        balance -= 100; // balance = balance - 100
        System.out.println("After withdrawal: $" + balance);

        balance *=3; // balance = balance * 3
        System.out.println("After growth multiplier: $" + balance);

        balance /= 2; // balance = balance / 2
        System.out.println("After normalization: $" + balance);

        int counter = 17;
        counter %= 4; // counter = counter % 4
        System.out.println("Counter after modulo: " + counter);
    }
}
