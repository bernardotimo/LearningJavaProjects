package fundamentals.operators;

public class UnaryDemo {

    public static void run() {

        //Unary plus and minus
        int a = 10;

        System.out.println(+a);
        System.out.println(-a);

        //Increment and decrement
        int b = 5;

        System.out.println(b++); //Post-increment - returns old value, then increments
        System.out.println(b);

        System.out.println(++b); //Pre-increment - increments first, then returns value
        System.out.println(b);   //It is preferable to use ++b to avoid ambiguity


    }
}
