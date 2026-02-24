package fundamentals.strings;

public class FormattingDemo {

    public static void main() {

        //string formatting
        String input = "Hello %s";

        String output1 = input.formatted("World");
        System.out.println(output1);

        String output2 = input.formatted("Bernardo");
        System.out.println(output2);

        System.out.println();
    }
}
