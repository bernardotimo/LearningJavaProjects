package methods;

public class ParametersDemo {

    //Allow passing input values to methods

    //Without parameters
    static void sayHelloV1() {
        System.out.println("Hello");
    }

    static int multiplication() {
        return 10 * 10;
    }

    //With a parameter
    static void sayHello(String name) { //String parameter called name
        System.out.println("Hello " + name);

    }

    static double division (double number) {
        return number / 2;
    }

    public static void main(String[] args) {
        //Calling methods
        sayHelloV1();
        sayHello("Alice");
        sayHello("Sam");
        multiplication();
        division(10);

        int mult = multiplication();
        double div = division(10);

        System.out.println(mult);
        System.out.println(div);
    }

}
