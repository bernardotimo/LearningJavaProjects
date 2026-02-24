package fundamentals.operators;

public class InstanceofDemo {

    public static void main(String[] args){

        //Checks whether an object belongs to a specific class or interface at runtime
        //Always returns boolean

        //Simple example
        String name = "Java";

        System.out.println(name instanceof String);

        //Data
        Object[] data = {
                "Java",
                43,
                true,
                "Games",
                "Bernardo"
        };

        for (Object obj : data) {
            if (obj instanceof String s) {
                System.out.println(s.toUpperCase());
            }
        }
    }
}
