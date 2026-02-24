package fundamentals.strings;

public class MatchDemo {

    public static void main() {

        //Matching - returns true if the regular expression matches the string, and false if not
        String text = "one two three two one";
        boolean matches = text.matches(".*two.*"); //.* means anything before and anything after

        System.out.println(matches);
        System.out.println();
    }
}
