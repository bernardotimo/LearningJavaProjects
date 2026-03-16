package methods;

public class PrefixSuffixDemo {

    public static void main(String[] args) {

        //startsWith() and endsWith()
        String phrase = "This is a good day to learn";

        System.out.println(phrase.startsWith("This"));
        System.out.println(phrase.startsWith("This", 5));

        System.out.println(phrase.endsWith("code"));
        System.out.println(phrase.endsWith("shower"));
        System.out.println();
    }
}
