package fundamentals.strings;

public class SplitDemo {

    public static void main() {

        //splitting strings
        String history = "A man drove his car";
        int limit = 2;
        String[] occurrences = history.split("a", limit);

        for (String occurrence : occurrences) {
            System.out.println(occurrence);
        }
    }
}
