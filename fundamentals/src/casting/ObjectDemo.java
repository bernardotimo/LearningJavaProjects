package casting;

public class ObjectDemo {

    public static void main(String[] args) {

        //Sometimes Java only knows a variable as an object
        // Object obj = "java"; - // obj.toUpperCase(); ❌ compile error

        Object obj = "java";

        if (obj instanceof String s){
            System.out.println(s.toUpperCase()); //Better example in fundamentals/operators/InstanceofDemo
        }
    }
}
