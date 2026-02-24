package fundamentals.strings;

public class TrimDemo {

    public static void main(String[] args) {

        //trim() - remove white spaces at the end and beginning
        String text1 = "    He ran across the field           ";
        String trimmed = text1.trim();

        System.out.println(trimmed); //useful when someone type extra space after last words


    }
}
