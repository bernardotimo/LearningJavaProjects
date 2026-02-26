package fundamentals.methods;

public class CompareDemo {

    public static void main(String[] args) {

        //equals()
        String a = "abc";
        String b = "efg";
        String c = "abc";
        String d = "ABC";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d));
        System.out.println();

        //compareTo()
        String e = "abc";
        String f = "def";
        String g = "abd";

        System.out.println(e.compareTo(f));
        System.out.println(e.compareTo(g));
    }
}
