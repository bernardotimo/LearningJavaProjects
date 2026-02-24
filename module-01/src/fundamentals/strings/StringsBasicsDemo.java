package fundamentals.strings;

public class StringsBasicsDemo {
    public static void main(String[] args) {

        //Literal way
        String language = "Java";
        System.out.println(language);

        //With new operator
        String name = new String("Bernardo");
        System.out.println(name);

        System.out.println();

        //Length
        String string = "Hello World";
        int length = string.length();

        System.out.println(length);

        //CharAt
        String theString = "This is my string";

        System.out.println(theString.charAt(0));
        System.out.println(theString.charAt(3));
    }
}
