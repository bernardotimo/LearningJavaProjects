package fundamentals.strings;

public class ConcatenationDemo {

    public static void  main(String[] args) {

        // + for small concatenations and StringBuilder for loops

        //Concatenating
        String one = "Bernardo";
        String two = "Timo";
        String three = one + " " + two;

        System.out.println(three);

        //The better way to concatenate strings to avoid optimization problems is using StringBuilder
        //Without it, a new string is created and old strings becomes garbage
        String[] strings = new String[]{"one", "two", "three"};

        StringBuilder temp = new StringBuilder(); //creates and reuse (once)

        for (String s : strings) {
            temp.append(s);
            temp.append(" "); //add space between words
        }

        String result = temp.toString(); //convert to string
        System.out.println(result);
    }
}
