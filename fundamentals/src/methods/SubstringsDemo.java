package methods;

public class SubstringsDemo {

    public static void main(String[] args) {

        //Substring
        String string1 = "Hello World";
        String substring = string1.substring(0,7);

        System.out.println(substring);

        //Searching for substrings with indexOf
        String fruit = "Passion Fruit";
        String substring1 = "s";

        int index = fruit.indexOf(substring1);
        while(index != -1) {
            System.out.println(index);
            index = fruit.indexOf(substring1, index + 1);
        } //iterates over all marked substrings

        //Last occurrence of a substring
        String theString = "this is your last chance";
        String theSubstring = "last";

        int lastOccurrence = theString.lastIndexOf(theSubstring);

        System.out.println(lastOccurrence);

    }
}
