package fundamentals.operators;

public class RelationalDemo {

    public static void run() {

        //Results are always boolean

        int a = 10;
        int b = 20;
        int c = 10;
        int d = 5;

        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is b not equal to a? " + (b != a));
        System.out.println("Is c greater than a? " + (c > a));
        System.out.println("Is d less than c? " + (d < c));
        System.out.println("Is a grater or equal than c? " + (a >= c));
        System.out.println("Is d less or equal than b? " + (d <= b));
    }
}
