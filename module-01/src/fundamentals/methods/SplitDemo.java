package fundamentals.methods;

public class SplitDemo {

    public static void main(String[] args) {

        //splitting strings
        String history = "A man drove his car";
        int limit = 2;
        String[] occurrences = history.split("a", limit);

        for (String occurrence : occurrences) {
            System.out.println(occurrence);
        }
    }
}
